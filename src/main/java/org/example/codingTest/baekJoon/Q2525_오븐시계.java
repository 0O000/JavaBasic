package org.example.codingTest.baekJoon;

import java.util.Scanner;

public class Q2525_오븐시계 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int add = sc.nextInt();

        int calHour = calculate(hour, minute, add);
        int ansHour = calculateHour((calHour)) / 60;
        int ansMinute = calHour % 60;

        System.out.println(ansHour + " " + ansMinute);

    }
    public static int calculate(int hour, int minute, int add) {
        minute += (hour * 60) + add;
        return minute;
    }
    public static int calculateHour(int calHour) {
        if(calHour > 1440){
            calHour -= 1440;
            return calculateHour(calHour);
        }else{
            return calHour;
        }
    }
}
