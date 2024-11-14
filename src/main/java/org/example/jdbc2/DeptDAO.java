package org.example.jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeptDAO {
    Connection con;

    public DeptDAO() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/shop2";
        String id = "root";
        String pw = "1234";
        con = DriverManager.getConnection(url, id, pw);
    }

    public void insert(DeptVO vo) throws Exception {
        String sql = "insert into dept values(?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, vo.getDeptno());
        ps.setString(2, vo.getDname());
        ps.setString(3, vo.getLoc());

        ps.executeUpdate();
        System.out.println("=====삽입 성공=====");
    }

    public void update(DeptVO vo) throws Exception {
        String sql = "update dept set dname = ? where deptno = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, vo.getDname());
        ps.setInt(2, vo.getDeptno());

        ps.executeUpdate();
        System.out.println("=====수정 성공=====");
    }

    public void delete(DeptVO vo) throws Exception {
        String sql = "delete from dept where deptno = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, vo.getDeptno());

        ps.executeUpdate();
        System.out.println("=====삭제 성공=====");
    }
}
