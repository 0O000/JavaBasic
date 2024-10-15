package org.example.day11.review;

public class Day {
    String doing;
    int time;
    String location;
    //객체생성시 멤버변수 초기화할 목적으로
    //생성자 메서드, 자동호출을 해준다.
    //생성자 메서드가 되기 위한 조건
    //1. 클래스이름과 무조건 동일해야함.
    //2. 리턴타입을 명시하면 자동호출되지 않음.
    //생성자의 특징
    //1. 오버로딩할 수 있음.
    //2. 프로그래머가 하나도 생성자를 명시하지 않으면 컴파일러가 하나를 추가해줌.
    //   public 클래스명(){...} -> 입력매개변수가 없는 메서드를 생성해줌!
    //   기본생성자(default constructor) -> 입력매개변수가 없는 생성자 메서드
    static int count;
    static int sum; //time누적!

    //멤버변수 초기화! 생성자.
    public Day(String doing, int time, String location) {
        this.doing = doing;
        this.time = time;
        this.location = location;
        count++;
        sum = sum + time; //sum += time;
    }


    public static double getAvg(){
        return sum / (double)count;
    }

    //멤버변수를 프린트할 목적!
    //@Override -> 생략가능!
    public String toString() {
        return "Day{" +
                "doing='" + doing + '\'' +
                ", time=" + time +
                ", location='" + location + '\'' +
                '}';
    }
}
