package org.example.day6.array3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q1_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###,###");
        Object[][] movieInfo = {
                {"1", "Quiet Place", 15000},
                {"2", "Avengers Endgame", 23000},
                {"3", "Inception", 18000},
                {"4", "Parasite", 21000},
                {"5", "InterStellar", 19000}
        };
        System.out.println("네이버 시리즈온 실시간 영화 목록: ");
        for (int i = 0; i < movieInfo.length; i++) {
            for (int j = 0; j < movieInfo[i].length; j++) {
                if (j == 0) {
                    System.out.print(movieInfo[i][j] + ".");
                }
                if (j == 1) {
                    System.out.print(movieInfo[i][j] + " - ");
                }
                if (j == 2) {
                    String formatMoney = df.format(movieInfo[i][j]);
                    System.out.print("조회수: " + formatMoney);
                }
            }
            System.out.println();
        }
        boolean flag = true;
        while (flag) {
            System.out.println();
            System.out.println("정보를 확인하고 싶은 영화 번호를 선택하세요 (1~5): ");
            String select = sc.nextLine();
            for (int i = 0; i < movieInfo.length; i++) {
                if (movieInfo[i][0].equals(select)) {
                    System.out.println("선택한 영화: " + movieInfo[i][1]);
                    System.out.print("조회수: " + movieInfo[i][2]);
                    flag = false;
                    break;
                }
            }
        }
    }
}