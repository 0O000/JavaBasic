package org.example.day10.문제;

public class Q3_main {
    public static void main(String[] args) {
        Q3 work1 = new Q3("홍길동", 25, "여");
        Q3 work2 = new Q3("김길동", 24, "남");
        Q3 work3 = new Q3("송길동", 26, "여");

        System.out.println("우리회사 직원의 수: " + Q3.count);
        System.out.println("우리회사 직원의 정보");
        System.out.println(work1);
        System.out.println(work2);
        System.out.println(work3);
        System.out.println("우리회사 직원의 평균 나이: " + Q3.sumAge / Q3.count);
    }
}
