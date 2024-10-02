package org.example.day5.array2;

import java.util.Scanner;

public class 인기투표 {
    public static void main(String[] args) {
        String[] name = {"아이유", "유재석", "방탄"};
        int[] tv = new int[name.length];

        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("인기투표 0)아이유, 1)유재석, 2)방탄, 3)종료");
            System.out.print("선택번호>> ");
            int num = sc.nextInt();
            if(num == 3){
                System.out.println("시스템을 종료합니다.");
                for(int i = 0; i < name.length; i++){
                    System.out.println(name[i] + ": " + tv[i] + "표");
                }
                break;
            }
            tv[num]++;
            System.out.println(name[num] + "표 득표");
        }
    }
}
