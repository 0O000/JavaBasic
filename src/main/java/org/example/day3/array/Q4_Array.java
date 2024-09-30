package org.example.day3.array;

import java.util.Scanner;

public class Q4_Array {
    public static void main(String[] args) {
        int[] movie = new int[10];
        int sum = 0;
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("현재 좌석 상태: ");
            for (int i = 0; i < movie.length; i++) {
                System.out.print((i + 1) + ":" + movie[i] + " ");
            }
            System.out.println();
            System.out.print("예매할 좌석 번호를 입력하세요 (종료하려면 0입력): ");
            int seat = sc.nextInt() - 1;
            if(seat == -1){
                break;
            }
            movie[seat] += 1;
            System.out.println(seat + 1 + "번 좌석이 예매 되었습니다. ");
            sum += 1;
        }
        System.out.println("예매된 좌석 수: " + sum);
        System.out.println("총 예매금액: " + sum * 10000 + "원");
    }
}
