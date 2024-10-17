package org.example.day13.예외처리;

import java.io.IOException;

public class 문제발생클래스 {
    public static void main(String[] args) {
        System.out.println("1. 나는 프린트가 잘 될 예정");
        try {
            System.out.println("2. 문제 발생 코드" + 10 / 0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println(e.getMessage()); //간단하게 문제에 대해 스트링으로 나타내줌
        }
        System.out.println("3. 나는 과연 프린트가 될까요?");
    }
}
