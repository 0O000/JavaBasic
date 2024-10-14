package org.example.day10.생성자;

public class tv사용 {
    public static void main(String[] args) {
        tv myTv = new tv(7, 9, true);
        tv yourTv = new tv(8, 12, true);

        System.out.println(myTv);
        System.out.println(yourTv);
    }
}