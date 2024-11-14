package org.example.jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BoardDAO {
    Connection con;

    public BoardDAO() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/shop2";
        String id = "root";
        String pw = "1234";
        con = DriverManager.getConnection(url, id, pw);
    }

    public void insert(int no값, String title값, String content값, String writer값) throws Exception {
        String sql = "insert into board values(?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, no값);
        ps.setString(2, title값);
        ps.setString(3, content값);
        ps.setString(4, writer값);

        ps.executeUpdate();
        System.out.println("=====삽입 성공=====");
    }

    public void update(String content값, int no값) throws Exception {
        String sql = "update board set content = ? where no = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, content값);
        ps.setInt(2, no값);
        ps.executeUpdate();
        System.out.println("=====수정 성공=====");
    }

    public void delete(int no값) throws Exception {
        String sql = "delete from board where no = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, no값);
        ps.executeUpdate();
        System.out.println("=====수정 성공=====");
    }
}
