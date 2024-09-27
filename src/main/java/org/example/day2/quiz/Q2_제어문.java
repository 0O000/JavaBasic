package org.example.day2.quiz;

import java.util.Scanner;

public class Q2_제어문 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char game = 'y';
        int score1 = 0;
        int score2 = 0;
        int count = 0;

        System.out.println("게임을 계속 하시겠습니까? y / n");
        game = sc.next().charAt(0);

        while(game == 'y'){

            System.out.print("첫 번째 사람의 숫자를 입력하세요: ");
            int a = sc.nextInt();
            System.out.print("두 번째 사람의 숫자를 입력하세요: ");
            int b = sc.nextInt();

            if(a > b){
                System.out.println("첫 번째 사람이 이겼습니다.");
                score1++;
            }else{
                System.out.println("두 번째 사람이 이겼습니다.");
                score2++;
            }

            count++;

            System.out.println("총 게임 수: " + count);
            System.out.println("첫 번째 사람이 이긴 수: " + score1);
            System.out.println("두 번째 사람이 이긴 수: " + score2);

            System.out.println("게임을 계속 하시겠습니까? y / n");
            game = sc.next().charAt(0);
        }

    }
}