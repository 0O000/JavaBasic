package org.example.jdbc2;

import java.util.Scanner;

public class DeptDeleteUI {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("DEPTNO 입력: ");
        int DEPTNO = sc.nextInt();

        DeptDAO dao = new DeptDAO();
        //가방 만들기(new) -> 넣기(set) -> 전달
        DeptVO vo = new DeptVO();

        vo.setDeptno(DEPTNO);
        dao.delete(vo); //vo의 값 전달
    }
}