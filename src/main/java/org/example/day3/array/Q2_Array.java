package org.example.day3.array;

import java.util.Arrays;
import java.util.Random;

public class Q2_Array {
    public static void main(String[] args) {

        Random r = new Random();

        int[] randomArray01 = new int[10];
        for (int i = 0; i < randomArray01.length; i++) {
            randomArray01[i] = r.nextInt(49) + 1;
        }
        int[] randomArray02 = new int[10];
        for (int i = 0; i < randomArray02.length; i++) {
            randomArray02[i] = r.nextInt(50) + 1;
        }
        Arrays.sort(randomArray01);
        Arrays.sort(randomArray02);
        System.out.println("배열1: " + Arrays.toString(randomArray01));
        System.out.println("배열2: " + Arrays.toString(randomArray02));
        int sumMax = randomArray01[randomArray01.length - 1] + randomArray02[randomArray02.length - 1];
        System.out.println("정렬 후 가장 큰값의 합: " + sumMax);
        System.out.println("정렬 후 가장 큰값의 합: " + randomArray01[0] + randomArray02[0]);
    }
}
