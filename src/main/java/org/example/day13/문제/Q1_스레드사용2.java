package org.example.day13.문제;

import org.example.day10.문제.Q1;

public class Q1_스레드사용2 {
    public static void main(String[] args) {
        Q1_TimeThread tt = new Q1_TimeThread();
        Q1_EvenThread et = new Q1_EvenThread();
        tt.start();
        et.start();
    }
}
