package org.example.codingTest.programmers;

public class 옷가게_할인_받기 {
    public int solution(int price) {
        int answer = 0;
        if(price >= 100000){
            answer = (int) (price * 0.95);
        }
        if(price >= 300000){
            answer = (int) (price * 0.90);
        }
        if(price >= 500000){
            answer = (int) (price * 0.80);
        }
        if(price < 100000){
            answer = price;
        }
        return answer;
    }
}