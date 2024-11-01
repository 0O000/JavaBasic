package org.example.codingTest.programmers;

public class Main {
    public static void main(String[] args) {
        PCCE_10 sol = new PCCE_10();
        int[][] list = {{1, 20300104, 100, 80}, {2, 20300804, 847, 37}, {3, 20300401, 10, 8}, {4, 20300301, 122, 22}};
        int[][] answer = sol.solution(list, "date", 20300501, "maximum");
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[i].length; j++) {
                System.out.print(answer[i][j] + " ");
            }
            System.out.println();
        }
    }
}