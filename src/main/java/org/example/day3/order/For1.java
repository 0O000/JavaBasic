package org.example.day3.order;

import java.util.Random;

public class For1 {
    public static void main(String[] args) {
        Random r = new Random();

        for(int i = 0; i < 3; i++){
            System.out.println("환영합니다.");
        }

        for(int i = 100; i < 201; i++){
            System.out.println(i);
        }

        for(int i = 0; i < 5; i++){
            System.out.println(r.nextInt(99));
        }
    }
}
