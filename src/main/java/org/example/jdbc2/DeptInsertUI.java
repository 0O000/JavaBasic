package org.example.jdbc2;

import java.util.Scanner;

public class DeptInsertUI {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("DEPTNO 입력: ");
        int DEPTNO = sc.nextInt();
        System.out.print("DNAME 입력: ");
        String DNAME = sc.next();
        System.out.print("LOC 입력: ");
        String LOC = sc.next();

        DeptDAO dao = new DeptDAO();
        //가방 만들기(new) -> 넣기(set) -> 전달
        DeptVO vo = new DeptVO();

        vo.setDeptno(DEPTNO);
        vo.setDname(DNAME);
        vo.setLoc(LOC);
        dao.insert(vo); //vo의 값 전달
    }
}