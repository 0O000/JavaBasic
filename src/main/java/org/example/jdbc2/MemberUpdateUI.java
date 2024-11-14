package org.example.jdbc2;

import java.util.Scanner;

public class MemberUpdateUI {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("수정할 id 입력: ");
        String id값 = sc.next();
        System.out.print("수정할 tel 입력: ");
        String tel값 = sc.next();

        MemberDAO dao = new MemberDAO();
        dao.update(tel값, id값);
    }
}