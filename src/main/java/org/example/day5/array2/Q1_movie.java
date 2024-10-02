package org.example.day5.array2;

import java.util.Scanner;

public class Q1_movie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] movieSeat = new int[10];
        int count = 0;
        while(true){
            System.out.println("--------------------");
            System.out.println("1 2 3 4 5 6 7 8 9 10");
            System.out.println("--------------------");
            for (int i = 0; i < movieSeat.length; i++) {
                System.out.print(movieSeat[i] + " ");
            }
            System.out.println();
            System.out.println("--------------------");
            System.out.print("예매할 좌석 번호를 입력(종료 0번>>>) ");
            int seat = sc.nextInt();
            if(seat == 0){
                System.out.println("예매 시스템을 종료합니다.");
                System.out.println("당신의 총 예매수는 " + count + "매");
                System.out.println("당신의 총 금액은 " + count * 10000 + "원");
                break;
            }
            if(seat < 11){
                movieSeat[seat - 1]++;
                count++;
                System.out.println("예매 완료");
            }
        }
    }
}
