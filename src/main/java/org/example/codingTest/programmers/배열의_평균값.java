package org.example.codingTest.programmers;

public class 배열의_평균값 {
    public double solution(int[] numbers) {
        int sum = 0;
        double answer = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        answer = (double) sum / numbers.length;
        return answer;
    }
}