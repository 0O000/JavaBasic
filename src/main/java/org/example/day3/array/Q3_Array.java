package org.example.day3.array;

import java.util.Scanner;

public class Q3_Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int studentNum = 0;
        int[] score = new int[studentNum];

        while(true){
            int select = 0;
            System.out.println("-----------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("-----------------------------------------------");
            System.out.print("선택>");
            select = sc.nextInt();
            if(select == 1){
                System.out.print("학생수>");
                studentNum = sc.nextInt();
                score = new int[studentNum];
            }
            else if(select == 2){
                if(!(studentNum == 0)){
                    for(int i = 0; i < score.length; i++){
                        System.out.print("score[" + i + "]>");
                        score[i] = sc.nextInt();
                    }
                }
            } else if (select == 3) {
                if(!(studentNum == 0)){
                    for (int i = 0; i < score.length; i++) {
                        System.out.println("score[" + i + "]: " + score[i]);
                    }
                }
            }else if (select == 4) {
                if(!(studentNum == 0)){
                    int max = 0;
                    int avg = 0;
                    for (int i = 0; i < score.length; i++) {
                        if(score[i] > max){
                            max = score[i];
                        }
                        avg += score[i];
                    }
                    System.out.println("최고 점수: " + max);
                    System.out.println("평균 점수: " + avg / studentNum);
                } else if (select == 5) {
                    break;
                }
            }
        }
    }
}
