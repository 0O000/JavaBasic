package org.example.day4.array;

import java.util.Arrays;
import java.util.Random;

public class 로또만들기 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] lotto = new int[20];
        for (int i = 0; i < lotto.length; i++) {
            boolean flag = true;
            int x = r.nextInt(45) + 1;
            System.out.println(x);
            for(int x2 : lotto) {
                if(x == x2){
                    System.out.println("중복값이 있습니다.");
                    System.out.println(x2);
                    flag = false;
                    i--;
                    break;
                }
            }
            if(flag){
                lotto[i] = x;
            }
        }
        Arrays.sort(lotto);
        System.out.println(Arrays.toString(lotto));


    }
}
