package org.example.day18.람다식;

public class LambdaExample2 {
    public static void main(String[] args) {
        SumFunctionalInterface sum = (a, b) -> a + b;
        SumFunctionalInterface sum2 = (a, b) -> (a + 100) + (b - 100);

        int result = sum.add(100, 200);
        int result2 = sum2.add(100, 200);

        System.out.println("더한결과: " + result);
        System.out.println("더한결과: " + result2);
    }
}
