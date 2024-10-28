package org.example.codingTest.programmers;

public class 피자_나눠_먹기_2 {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= 100; i++) {
            if((i * n) % 6 == 0){
                answer = (i * n) / 6;
                break;
            }
        }
        return answer;
    }
}