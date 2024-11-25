package org.example.dbcp;

import java.util.Scanner;

public class MemberInsertUI2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("id 입력: ");
        String id값 = sc.next();
        System.out.print("pw 입력: ");
        String pw값 = sc.next();
        System.out.print("name 입력: ");
        String name값 = sc.next();
        System.out.print("tel 입력: ");
        String tel값 = sc.next();

        MemberDAO2 dao = new MemberDAO2();
        //가방 만들기(new) -> 넣기(set) -> 전달
        MemberVO vo = new MemberVO();

        vo.setId(id값);
        vo.setPw(pw값);
        vo.setName(name값);
        vo.setTel(tel값);
        dao.insert(vo); //vo의 값 전달
    }
}