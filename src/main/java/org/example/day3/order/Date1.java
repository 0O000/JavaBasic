package org.example.day3.order;

import java.util.Date;

public class Date1 {
    public static void main(String[] args) {
        Date date = new Date();
        int year = date.getYear() + 1900; //년
        int month = date.getMonth() + 1; //월
        int date1 = date.getDate(); //일
        int day = date.getDay(); //요일
        int hour = date.getHours(); //시
        int minute = date.getMinutes(); //분
        int second = date.getSeconds(); //초

        System.out.println(year + " " + month + " " + date1 + " " + day + " " + hour + " " + minute + " " + second);

        //오늘 무슨 요일인가요?
        if(day == 0){
            System.out.println("일요일");
        }
        if (day == 1) {
            System.out.println("월요일");
        }
        if(day == 2){
            System.out.println("화요일");
        }
        if(day == 3){
            System.out.println("수요일");
        }
        if (day == 4) {
            System.out.println("목요일");
        }
        if(day == 5){
            System.out.println("금요일");
        }
        if(day == 6){
            System.out.println("토요일");
        }
    }
}