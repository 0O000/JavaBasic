package org.example.day13.문제;

import java.util.Timer;

public class Q3_타이머테스트 {
    public static void main(String[] args) {
        Timer timer = new Timer();
        Q3_Timer작동 작동 = new Q3_Timer작동();
        System.out.println("5초동안 게임을 할 수 있습니다.");
        timer.schedule(작동, 5000);
        System.out.println("5초가 count되는 중입니다.");
        for (int i = 0; i < 10; i++) {
            
        }
    }
}
