package org.example.day21.알고리즘.선형;

public class 배열두배만들기 {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        for(int i = 0; i < numbers.length; i++) {
            answer[i] = numbers[i] * 2;
        }
        return answer;
    }
}