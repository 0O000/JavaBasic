package org.example.jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MemberDAO2 {
    Connection con;

    public MemberDAO2() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/shop2";
        String id = "root";
        String pw = "1234";
        con = DriverManager.getConnection(url, id, pw);
    }

    public void update(String tel값, String id값) throws Exception {
        String sql = "update member set tel = ? where id = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, tel값);
        ps.setString(2, id값);

        ps.executeUpdate();
        System.out.println("=====수정 성공=====");
    }

    public void delete(String id값) throws Exception {
        String sql = "delete from member where id = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, id값);

        ps.executeUpdate();
        System.out.println("=====삭제 성공=====");
    }

    public void insert(MemberVO vo) throws Exception {
        String sql = "insert into member values(?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, vo.getId());
        ps.setString(2, vo.getPw());
        ps.setString(3, vo.getName());
        ps.setString(4, vo.getTel());

        ps.executeUpdate();
        System.out.println("=====삽입 성공=====");
    }
}
