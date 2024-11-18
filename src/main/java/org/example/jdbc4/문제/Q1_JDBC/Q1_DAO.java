package org.example.jdbc4.문제.Q1_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Q1_DAO {
    Connection con;

    public Q1_DAO() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("1. 드라이버 설정 성공!");
        String url = "jdbc:mysql://localhost:3306/shop2";
        String id = "root";
        String pw = "1234";
        con = DriverManager.getConnection(url, id, pw);
        System.out.println("2. db연결 성공!");
    }

    public Q1_VO search(int ProductID) throws Exception {
        Q1_VO bag = new Q1_VO();
        String sql = "select * from product where ProductID = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, ProductID);
        ResultSet table = ps.executeQuery();
        if (table.next()) {//true
            bag.setProductId(table.getInt("productID"));
            bag.setProductName(table.getString("productName"));
            bag.setPrice(table.getBigDecimal("price"));
            bag.setQuantity(table.getInt("quantity"));
        }else{
            bag = null;
        }
        return bag;
    }

    public ArrayList<Q1_VO> searchAll() throws Exception {
        ArrayList<Q1_VO> list = new ArrayList<>();

        String sql = "select * from product";
        PreparedStatement ps = con.prepareStatement(sql);

        ResultSet table = ps.executeQuery();
        while (table.next()) {

            Q1_VO bag = new Q1_VO();
            bag.setProductId(table.getInt("productID"));
            bag.setProductName(table.getString("productName"));
            bag.setPrice(table.getBigDecimal("price"));
            bag.setQuantity(table.getInt("quantity"));

            list.add(bag);
        }
        return list;
    }
}