package org.example.day8.class사용;

import org.example.day8.class만들기.계산기;

public class 내가계 {
    public static void main(String[] args) {
        계산기 cal = new 계산기();
        int result1 = cal.더하기(100, 200);
        int result2 = cal.더하기(1000, 2000);

        int total = cal.더하기(result1, result2);
        System.out.println("두 값의 합: " + total);
//        System.out.println("두 값의 빼기: " + cal.빼기(result1, result2););
//        void의 경우, 바로 출력할 수도, 연산도 불가능!
    }
}