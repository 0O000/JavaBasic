package org.example.jdbc4.list;

import org.example.jdbc4.one.DeptDAO;
import org.example.jdbc4.one.DeptVO;

import java.util.ArrayList;

public class DeptListUI {
    public static void main(String[] args) throws Exception {
        DeptDAO dao = new DeptDAO(); //1~2단계
        //모든 리스트를 가지고 오자.
        ArrayList<DeptVO> list = dao.list();
        //반복해서 꺼내어 출력~! {vo, vo}
        for (DeptVO bag : list) {
            System.out.println("deptno: " + bag.getDeptno());
            System.out.println("dname: " + bag.getDname());
            System.out.println("loc: " + bag.getLoc());
            System.out.println("===============");
        }
    }
}