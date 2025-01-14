package org.example.codingTest.baekJoon;

import java.util.Scanner;

public class Q1003_피보나치_함수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] inputs = new int[T];

        for (int i = 0; i < T; i++) {
            inputs[i] = sc.nextInt();
        }

        int[][] dp = new int[41][2];

        dp[0][0] = 1;
        dp[0][1] = 0;
        dp[1][0] = 0;
        dp[1][1] = 1;

        for (int i = 2; i <= 40; i++) {
            dp[i][0] = dp[i - 1][0] + dp[i - 2][0];
            dp[i][1] = dp[i - 1][1] + dp[i - 2][1];
        }

        for (int i = 0; i < T; i++) {
            int N = inputs[i];
            System.out.println(dp[N][0] + " " + dp[N][1]);
        }

        sc.close();
    }
}
