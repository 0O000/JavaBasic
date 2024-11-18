package org.example.jdbc4.연습;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DeptDAO2 {
    //JDBC 4단계
    Connection con;

    public DeptDAO2() throws Exception {
        //객체 생성시 1~2단계를 실행하게 하자.
        //crud할 때 모두 동일하므로!!
        //생성자메서드는 객체생성시 꼭 해주어야
        //작업을 작성하는 메서드(멤버변수 초기화같은 작업)
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("1. 드라이버 설정 성공!");
        String url = "jdbc:mysql://localhost:3306/shop2";
        String id = "root";
        String pw = "1234";
        con = DriverManager.getConnection(url, id, pw);
        System.out.println("2. db연결 성공!");
    }

    public DeptVO2 one(int deptno) throws Exception {
        DeptVO2 bag = new DeptVO2();
        String sql = "select deptno, dname, loc from dept where deptno = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, deptno);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            bag.setDeptno(rs.getInt("deptno"));
            bag.setDname(rs.getString("dname"));
            bag.setLoc(rs.getString("loc"));
        }
        return bag;
    }

    public ArrayList<DeptVO2> list() throws Exception {
        ArrayList<DeptVO2> list = new ArrayList<>();
        String sql = "select deptno, dname, loc from dept";
        PreparedStatement ps = con.prepareStatement(sql);

        ResultSet table = ps.executeQuery();
        while (table.next()) {
            DeptVO2 bag = new DeptVO2();
            bag.setDeptno(table.getInt("deptno"));
            bag.setDname(table.getString("dname"));
            bag.setLoc(table.getString("loc"));
            list.add(bag);
        }
        return list;
    }
}