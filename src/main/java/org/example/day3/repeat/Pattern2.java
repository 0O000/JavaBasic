package org.example.day3.repeat;

public class Pattern2 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 499; i++) {
            sum += i;
        }
        System.out.println(sum);
        sum = 0;
        for (int i = 1; i <= 101; i++) {
            if (i % 4 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
        sum = 0;
        for (int i = 500; i >= 0; i = i - 2) {
            if (!(i % 5 == 0)) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
