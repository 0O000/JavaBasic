package org.example.jdbc3.read연습;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class deptDAO {
    Connection con;

    public deptDAO() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("1. 드라이버 설정 성공!");
        String url = "jdbc:mysql://localhost:3306/shop2";
        String id = "root";
        String pw = "1234";
        con = DriverManager.getConnection(url, id, pw);
        System.out.println("2. db연결 성공!");
    }

    public deptVO one(int deptno) throws Exception {
        String sql = "select * from dept where deptno  = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, deptno);
        ResultSet table = ps.executeQuery();
        deptVO vo = new deptVO();
        if (table.next()) {
            vo.setDeptno(table.getInt("deptno"));
            vo.setDname(table.getString("dname"));
            vo.setLoc(table.getString("loc"));
        }
        return vo;
    }
}