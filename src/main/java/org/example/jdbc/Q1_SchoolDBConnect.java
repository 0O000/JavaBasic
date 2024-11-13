package org.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Q1_SchoolDBConnect {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("MYSQL 자바 연결할 DRIVER 설정 성공");
        String url = "jdbc:mysql://localhost:3306/shop2";
        String id = "root";
        String pw = "1234";

        Connection con = DriverManager.getConnection(url, id, pw);
        String sql = "select * from dept2";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.executeQuery();
        System.out.println("MYSQL 연결 성공.");
    }
}