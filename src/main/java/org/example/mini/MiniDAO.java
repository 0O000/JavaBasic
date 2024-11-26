package org.example.mini;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MiniDAO {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/mini";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "1234";

    public List<MiniVO> getAllPendingRequests() {
        List<MiniVO> requestList = new ArrayList<>();
        String query = "SELECT request_id, requester_id, responder_id, product_name, quantity, status FROM Requests";

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement stmt = connection.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                MiniVO request = new MiniVO();
                request.setRequestId(rs.getInt("request_id"));
                request.setRequesterId(rs.getString("requester_id"));
                request.setResponderId(rs.getString("responder_id"));
                request.setProductName(rs.getString("product_name"));
                request.setQuantity(rs.getInt("quantity"));
                request.setStatus(rs.getString("status"));
                requestList.add(request);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return requestList;
    }

    public List<MiniVO> getAllQuantity() throws Exception {
        List<MiniVO> qantitytList = new ArrayList<>();
        String query = "SELECT user_id, product_name, price, product_name, quantity FROM UserInventory";
        Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        PreparedStatement stmt = connection.prepareStatement(query);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            MiniVO request = new MiniVO();
            request.setUserId(rs.getString("user_id"));
            request.setProductName(rs.getString("product_name"));
            request.setPrice(rs.getBigDecimal("price"));
            request.setQuantity(rs.getInt("quantity"));
            qantitytList.add(request);
        }

        return qantitytList;
    }

    public void processRequest(int requestId) {
        Connection connection = null;
        PreparedStatement getRequestStmt = null;
        PreparedStatement updateRequesterStmt = null;
        PreparedStatement updateResponderStmt = null;
        PreparedStatement updateRequestStatusStmt = null;

        try {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            connection.setAutoCommit(false);

            String getRequestQuery = "SELECT requester_id, responder_id, product_name, quantity, status FROM Requests WHERE request_id = ?";
            getRequestStmt = connection.prepareStatement(getRequestQuery);
            getRequestStmt.setInt(1, requestId);
            ResultSet requestResult = getRequestStmt.executeQuery();

            if (!requestResult.next()) {
                System.out.println("요청 ID를 찾을 수 없습니다.");
                return;
            }

            String requesterId = requestResult.getString("requester_id");
            String responderId = requestResult.getString("responder_id");
            String productName = requestResult.getString("product_name");
            int quantity = requestResult.getInt("quantity");
            String status = requestResult.getString("status");

            if (!status.equals("PENDING")) {
                System.out.println("이미 처리된 요청입니다.");
                return;
            }

            String getResponderProductQuery = "SELECT quantity FROM UserInventory WHERE user_id = ? AND product_name = ?";
            PreparedStatement getResponderProductStmt = connection.prepareStatement(getResponderProductQuery);
            getResponderProductStmt.setString(1, responderId);
            getResponderProductStmt.setString(2, productName);
            ResultSet responderProductResult = getResponderProductStmt.executeQuery();

            if (!responderProductResult.next() || responderProductResult.getInt("quantity") < quantity) {
                String rejectRequestQuery = "UPDATE Requests SET status = 'REJECTED' WHERE request_id = ?";
                updateRequestStatusStmt = connection.prepareStatement(rejectRequestQuery);
                updateRequestStatusStmt.setInt(1, requestId);
                updateRequestStatusStmt.executeUpdate();

                connection.commit();
                System.out.println("재고 부족으로 요청이 거절되었습니다.");
                return;
            }

            String updateRequesterQuery = "INSERT INTO UserInventory (user_id, product_name, price, quantity) " + "VALUES (?, ?, 0, ?) " +
                            "ON DUPLICATE KEY UPDATE quantity = quantity + ?";
            updateRequesterStmt = connection.prepareStatement(updateRequesterQuery);
            updateRequesterStmt.setString(1, requesterId);
            updateRequesterStmt.setString(2, productName);
            updateRequesterStmt.setInt(3, quantity);
            updateRequesterStmt.setInt(4, quantity);
            updateRequesterStmt.executeUpdate();

            String updateResponderQuery = "UPDATE UserInventory SET quantity = quantity - ? WHERE user_id = ? AND product_name = ?";
            updateResponderStmt = connection.prepareStatement(updateResponderQuery);
            updateResponderStmt.setInt(1, quantity);
            updateResponderStmt.setString(2, responderId);
            updateResponderStmt.setString(3, productName);
            updateResponderStmt.executeUpdate();

            String acceptRequestQuery = "UPDATE Requests SET status = 'ACCEPTED' WHERE request_id = ?";
            updateRequestStatusStmt = connection.prepareStatement(acceptRequestQuery);
            updateRequestStatusStmt.setInt(1, requestId);
            updateRequestStatusStmt.executeUpdate();

            connection.commit();
            System.out.println("요청이 수락되었습니다.");
        } catch (SQLException e) {
            if (connection != null) {
                try {
                    connection.rollback();
                    System.out.println("트랜잭션 롤백이 수행되었습니다.");
                } catch (SQLException rollbackEx) {
                    System.err.println("롤백 실패: " + rollbackEx.getMessage());
                }
            }
            e.printStackTrace();
        } finally {
            try {
                if (getRequestStmt != null) getRequestStmt.close();
                if (updateRequesterStmt != null) updateRequesterStmt.close();
                if (updateResponderStmt != null) updateResponderStmt.close();
                if (updateRequestStatusStmt != null) updateRequestStatusStmt.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}