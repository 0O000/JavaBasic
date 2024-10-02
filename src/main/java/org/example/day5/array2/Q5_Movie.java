package org.example.day5.array2;

import java.util.Scanner;

public class Q5_Movie {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] movieSeat = new int[3][10];
        int input = 0;
        int x = 0;
        int y = 0;
        int count = 0;

        for(int i = 0; i < movieSeat.length; i++){
            for(int j = 0; j < movieSeat[i].length; j++){
                movieSeat[i][j] = 0;
            }
        }

        while (true) {
            System.out.println("-------------------");
            System.out.println("0 1 2 3 4 5 6 7 8 9");
            System.out.println("-------------------");
            for(int i = 0; i < movieSeat.length; i++){
                for(int j = 0; j < movieSeat[i].length; j++){
                    System.out.print(movieSeat[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("-------------------");
            System.out.println("예매 1, 종료 0: ");
            input = sc.nextInt();
            if(input == 1){
                System.out.println("예매할 행 번호: ");
                y = sc.nextInt();
                System.out.println("예매할 열 번호: ");
                x = sc.nextInt();
                if(movieSeat[y][x] == 1){
                    System.out.println("예약 불가합니다.");
                }else {
                    System.out.println("예매 완료");
                    movieSeat[y][x] += 1;
                    count++;
                }
            }if(input == 0){
                break;
            }
        }
        System.out.println("당신의 총 예매 수: " + count);
        System.out.println("당신의 총 금액: " + count * 10000 + "원");
    }
}
