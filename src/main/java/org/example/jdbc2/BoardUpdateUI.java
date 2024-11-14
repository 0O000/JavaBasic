package org.example.jdbc2;

import java.util.Scanner;

public class BoardUpdateUI {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("no 입력: ");
        int no값 = sc.nextInt();
        sc.nextLine();
        System.out.print("content 입력: ");
        String content값 = sc.nextLine();

        BoardDAO dao = new BoardDAO();
        dao.update(content값, no값);
    }
}