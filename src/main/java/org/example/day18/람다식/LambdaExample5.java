package org.example.day18.람다식;

public class LambdaExample5 {
    public static void main(String[] args) {
        DifferenceFunctionalInterface difference = (a, b) -> a - b;

        int result = difference.subtract(300, 100);
        System.out.println("뺄셈결과: " + result);
    }
}