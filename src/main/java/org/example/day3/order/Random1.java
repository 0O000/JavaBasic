package org.example.day3.order;

import java.util.Random;

public class Random1 {
    public static void main(String[] args) {
        Random r = new Random(); //Seed값을 입력할 수 있다.

        r.setSeed(100); //랜덤값의 시드를 설정해서 동일한 값이 나오게 한다.

        for (int i = 0; i < 100; i++) {
            int num = r.nextInt(100);
            System.out.println(num);
        }
    }
}
