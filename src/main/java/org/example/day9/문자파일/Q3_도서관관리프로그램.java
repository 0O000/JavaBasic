package org.example.day9.문자파일;

import org.example.day9.UML문제.Item;

import java.util.Scanner;

public class Q3_도서관관리프로그램 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.print("책제목, 작가, isbn을 순서대로 입력>> ");
//        String[] input1 = sc.nextLine().split(" ");
//
//        System.out.print("책제목, 작가, isbn을 순서대로 입력>> ");
//        String[] input2 = sc.nextLine().split(" ");
//
//
//        Q3_도서관관리 myInfo1 = new Q3_도서관관리();
//        myInfo1.setTitle(input1[0]);
//        myInfo1.setAuthor(input1[1]);
//        myInfo1.setIsbn(input1[2]);
//
//        Q3_도서관관리 myInfo2 = new Q3_도서관관리();
//        myInfo2.setTitle(input1[0]);
//        myInfo2.setAuthor(input1[1]);
//        myInfo2.setIsbn(input1[2]);
//
//        System.out.println("-----등록된 도서관 책 목록-----");
//        System.out.println("Title: " + myInfo1.getTitle() + ", Author: " + myInfo1.getAuthor() + ", Isbn: " + myInfo1.getIsbn());
//        System.out.println("Title: " + myInfo2.getTitle() + ", Author: " + myInfo2.getAuthor() + ", Isbn: " + myInfo2.getIsbn());

        Q3_도서관관리[] ans =  new Q3_도서관관리[3];

        for (int i = 0; i < ans.length; i++) {
            Q3_도서관관리 myInfo = new Q3_도서관관리();
            System.out.print("책제목, 작가, isbn을 순서대로 입력>> ");
            String[] input = sc.nextLine().split(" ");
            myInfo.setTitle(input[0]);
            myInfo.setAuthor(input[1]);
            myInfo.setIsbn(input[2]);
            ans[i] = myInfo;
        }
        System.out.println("-----등록된 도서관 책 목록-----");
        for (int i = 0; i < ans.length; i++) {
            System.out.println("Title: " + ans[i].getTitle() + ", Author: " + ans[i].getAuthor() + ", Isbn: " + ans[i].getIsbn());
        }
    }
}