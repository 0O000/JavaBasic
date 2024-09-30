package org.example.day4.array;

import java.util.Arrays;
import java.util.Scanner;

public class 배열최댓값 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] save = new int[5];
        for (int i = 0; i < save.length; i++) {
            System.out.print("숫자 입력>> ");
            save[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(save));

        Arrays.sort(save);
        System.out.println("최솟값: " + save[0] + " 최댓값: " + save[save.length - 1]);

        //해당 인덱스까지 최대값 넣는 변수 필요
        int max = save[0];
        //for문 순회
        //if(max < save[i]이면, max = save[i]
        for (int i = 1; i < save.length; i++) {
            if (max < save[i]) {
                max = save[i];
            }
        }
        System.out.println(max);

        sc.close();
    }

}
