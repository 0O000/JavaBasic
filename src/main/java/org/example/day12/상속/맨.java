package org.example.day12.상속;

public class 맨 extends 사람 {
    int power;

    public 맨(char gender, String name, int age, int power) {
        super(gender, name, age);
        this.power = power;
    }

    public void run(){
        System.out.println("빨리 달리다.");
    }
}
