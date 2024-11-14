package org.example.jdbc2;

import java.util.Scanner;

public class MemberInsertUI {
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

        MemberDAO dao = new MemberDAO();
        dao.insert(id값, pw값, name값, tel값);
    }
}