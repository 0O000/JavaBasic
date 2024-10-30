package org.example.codingTest.baekJoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1915_가장큰정사각형 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] map = new int[N + 1][M + 1];
        for (int i = 1; i <= N; i++) {
            String[] input = br.readLine().split("");

            for (int j = 1; j <= M; j++) {
                map[i][j] = Integer.parseInt(input[j - 1]);
            }
        }
        for (int i = 1; i <= N; i++) {
            System.out.println(Arrays.toString(map[i]));
        }
    }
}
