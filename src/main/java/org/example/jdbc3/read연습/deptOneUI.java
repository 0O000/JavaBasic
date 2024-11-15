package org.example.jdbc3.read연습;

import javax.swing.*;
import java.util.Scanner;

public class deptOneUI {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("검색할 deptno입력: ");
        int deptno = sc.nextInt();

        deptDAO dao = new deptDAO();
        deptVO bag = dao.one(deptno);
        String total = bag.getDeptno() + " " + bag.getDname() + " "  + bag.getLoc();
        JOptionPane.showMessageDialog(null, total);
        sc.close();
    }
}