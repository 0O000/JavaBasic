package org.example.day3.array;

import java.util.Arrays;
import java.util.Random;

public class Q1_Array {
    public static void main(String[] args) {
        Random r = new Random();
        int[] randomArray = new int[20];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = r.nextInt(99) + 1;
        }
        System.out.println("배열 프린트: " + Arrays.toString(randomArray));
        Arrays.sort(randomArray);
        System.out.println("정렬 후 프린트: " + Arrays.toString(randomArray));
        System.out.println("MAX: " + randomArray[randomArray.length - 1]);
        System.out.println("MIN: " + randomArray[0]);
    }
}
