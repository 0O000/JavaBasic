package org.example.codingTest.programmers;

public class 옷가게_할인_받기 {
    public int solution(int price) {
        int answer = 0;
        if(price > 100000){
            answer = (price * 95) / 100;
        }
        if(price > 300000){
            answer = (price * 90) / 100;
        }
        if(price > 500000){
            answer = (price * 80) / 100;
        }
        return answer;
    }
}