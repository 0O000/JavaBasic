package org.example.day9.메모리그림;

public class Car사용 {
    public static void main(String[] args) {
        Car car1 = new Car();
        //Car(틀, 클래스) ==> new를 하면 실제로 사용되는 객체생성
        //Car1: 클래스의 인스턴스, 객체(object)
        //new로 객체생성 할때마다 멤버변수가 힙 영역에 만들어 진다.
        car1.size = 10;
        car1.speed = 20;
        //클래스의 인스턴스 car1: 참조형 변수
        //주소(힙영역) ==> 필드 접근(.), 메서드 호출 가능!
        System.out.println(car1.print());
        car1.hi();
        int age = 100;
        System.out.println("내 나이는 " + age);
    }
}
