package org.example.day10.문제;

public class Q1 {
    String doing;
    String location;
    int time;

    static int sumTime;
    static int count;
    static int avg;

    public Q1(String doing, String location, int time) {
        this.doing = doing;
        this.location = location;
        this.time = time;
        count++;
        sumTime += time;
    }

    public static double getAvg(){
        return sumTime / count;
    }

    @Override
    public String toString() {
        return "매일" + doing +
                "을 " + location +
                "에서 " + time +
                "시간 만큼";
    }
}
