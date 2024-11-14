package org.example.jdbc2;

import java.util.Scanner;

public class BoardInsertUI {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("no 입력: ");
        int no값 = sc.nextInt();
        System.out.print("title 입력: ");
        String title값 = sc.next();
        sc.nextLine();
        System.out.print("content 입력: ");
        String content값 = sc.nextLine();
        System.out.print("writer 입력: ");
        String writer값 = sc.next();

        BoardDAO dao = new BoardDAO();
        dao.insert(no값, title값, content값, writer값);
    }
}