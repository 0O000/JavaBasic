package org.example.day3.array;

import java.util.Scanner;

public class Q3_Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true){
            int select = 0;
            System.out.println("-----------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("-----------------------------------------------");
            System.out.println("선택>");
            select = sc.nextInt();
            if(select == 1){
                System.out.println("학생수>");
                int[] student = new int[sc.nextInt()];
            }
        }
    }
}
