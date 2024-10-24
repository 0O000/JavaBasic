package org.example.day18.디자인패턴;

public class 객체생성공장사용 {
    public static void main(String[] args) {
    객체생성공장클래스 factory = new 객체생성공장클래스();
    factory.getInstance("애플");
    factory.getInstance("바나나");
    }

}
