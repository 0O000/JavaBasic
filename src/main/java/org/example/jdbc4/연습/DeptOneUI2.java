package org.example.jdbc4.연습;

public class DeptOneUI2 {
    public static void main(String[] args) throws Exception {
        DeptDAO2 dao = new DeptDAO2();
        DeptVO2 bag = dao.one(1);
        System.out.println("deptno: " + bag.getDeptno());
        System.out.println("dname: " + bag.getDname());
        System.out.println("loc: " + bag.getLoc());
    }
}