package org.example.day18.람다식;

public class LambdaExample4 {
    public static void main(String[] args) {
        StringLengthFunctionalInterface length = (input) -> input.length();

        int result = length.getLength("사과해요 나한테!");
        
        System.out.println("문자열길이: " + result);
    }
}
