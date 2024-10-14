package org.example.day10.문제;

import com.sun.security.jgss.GSSUtil;

public class Q1_main {
    public static void main(String[] args) {
        Q1 day1 = new Q1("자바공부", "강남", 10);
        Q1 day2 = new Q1("여행", "강원도", 15);
        Q1 day3 = new Q1("운동", "피트니스", 11);

        System.out.println(day1);
        System.out.println(day2);
        System.out.println(day3);
        System.out.println("count: " + Q1.count);
        System.out.println("전체하는 일의 시간: " + Q1.sumTime);
        System.out.println("평균하는 시간: " + Q1.getAvg());
    }
}
