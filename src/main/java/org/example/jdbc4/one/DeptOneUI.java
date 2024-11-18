package org.example.jdbc4.one;

public class DeptOneUI {
    public static void main(String[] args) throws Exception {
        DeptDAO dao = new DeptDAO(); //1~2단계 실행
        DeptVO bag = dao.one(2); //3~4단계
        if(bag != null) {
            System.out.println("deptno: " + bag.getDeptno());
            System.out.println("dname: " + bag.getDname());
            System.out.println("loc: " + bag.getLoc());
        }else{
            System.out.println("검색결과가 없습니다.");
        }
    }
}