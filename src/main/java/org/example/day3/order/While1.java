package org.example.day3.order;

import java.util.Date;

public class While1 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
        System.out.println("--------------------");
        for(int j = 1; j <= 10; j++) {
            System.out.println(j);
        }
        while(true){
            System.out.println("내가 계속 돌아.");
            Date date = new Date();
            System.out.println(date);
        }
    }
}
