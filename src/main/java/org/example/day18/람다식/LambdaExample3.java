package org.example.day18.람다식;

public class LambdaExample3 {
    public static void main(String[] args) {
        StringFunctionalInterface upper = (input) -> input.toUpperCase();

        String result = upper.convert("hello world");
        
        System.out.println("대문자변환: " + result);
    }
}
