package org.example.day4.array;

import java.util.Random;

public class 배열토익 {
    public static void main(String[] args) {
        int[] ans = new int[990]; //Ctrl + D 한 줄 복사
        int[] myAns = new int[990];
        Random r = new Random(42);

        for (int i = 0; i < ans.length ; i++) {
            ans[i] = r.nextInt(4) + 1;
            myAns[i] = r.nextInt(4) + 1;
        }
        int jumsu = 0;
        for (int i = 0; i < myAns.length ; i++) {
            if(myAns[i] == ans[i]) {
                jumsu++;
            }
        }
        System.out.println(jumsu);
    }
}
