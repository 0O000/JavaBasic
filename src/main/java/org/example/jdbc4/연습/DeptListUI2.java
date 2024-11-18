package org.example.jdbc4.연습;

import java.util.ArrayList;

public class DeptListUI2 {
    public static void main(String[] args) throws Exception {
        DeptDAO2 dao = new DeptDAO2();
        ArrayList<DeptVO2> list = dao.list();
        for(DeptVO2 bag : list) {
            System.out.println("deptno: " + bag.getDeptno());
            System.out.println("dname: " + bag.getDname());
            System.out.println("loc: " + bag.getLoc());
            System.out.println("===============");
        }
    }
}