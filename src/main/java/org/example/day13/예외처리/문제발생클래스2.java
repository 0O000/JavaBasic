package org.example.day13.예외처리;

public class 문제발생클래스2 {
    public static void main(String[] args) throws Exception {
        System.out.println("1. 나는 프린트가 잘 될 예정");

        System.out.println("2. 문제 발생 코드" + 10 / 0);

        System.out.println("3. 나는 과연 프린트가 될까요?");
    }
}