package org.example.day10.생성자;

public class Car {
    //필드, 멤버변수
    String model;
    String color;
    int maxSpeed;

//    public Car(){
//        컴파일시 묵시적으로 생성
//        내용 없는 매서드 생성
//        프로그래머가 하나도 생성자를 만들어주지 않은 경우에만 생성됨
//        파라미터 없는 생성자 메서드
//    }


    //멤버메서드
    public void speedUp(){
        System.out.println("속도 UP");
    }
}
