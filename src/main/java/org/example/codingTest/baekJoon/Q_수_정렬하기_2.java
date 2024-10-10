package org.example.codingTest.baekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class Q_수_정렬하기_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        for(int i : arr){
            System.out.println(i);
        }
    }
}
