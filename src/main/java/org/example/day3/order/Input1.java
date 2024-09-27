package org.example.day3.order;

import java.util.Scanner;

public class Input1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("나이 입력>> ");
        int age = sc.nextInt();
        System.out.print("아침을 먹었는지 입력(true/false)?");
        boolean result = sc.nextBoolean();

        int nextAge = age + 1;
        String text = null;
        if (result) {
            text = "점심을 조금 먹어도 되겠네요.!";
        } else {
            text = "점심을 많이 먹어야 되겠네요.!";
        }

        System.out.println("내년 나이는 " + nextAge + "세");
        System.out.println("아침 식사 여부 결과 " + text);
    }
}