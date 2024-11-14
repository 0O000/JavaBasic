package org.example.jdbc2;

import java.util.Scanner;

public class DeptUpdateUI {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("DEPTNO 입력: ");
        int DEPTNO = sc.nextInt();
        System.out.print("DNAME 입력: ");
        String DNAME = sc.next();

        DeptDAO dao = new DeptDAO();
        //가방 만들기(new) -> 넣기(set) -> 전달
        DeptVO vo = new DeptVO();

        vo.setDeptno(DEPTNO);
        vo.setDname(DNAME);
        dao.update(vo); //vo의 값 전달
    }
}