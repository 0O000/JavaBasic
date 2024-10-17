package org.example.day13.예외처리;

public class 예외처리Main2 {
    public static void main(String[] args) {
        에러발생2 error = new 에러발생2();
        try {
            error.call();
        } catch (Exception e) {
            System.out.println("부르는 곳에서 예외처리함.");
        }
        System.out.println("에러 발생 후 실행될까요?");
    }
}
