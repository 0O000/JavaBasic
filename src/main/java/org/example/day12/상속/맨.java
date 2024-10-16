package org.example.day12.상속;

public class 맨 extends 사람 {
    int power;

    public 맨(String name, int age, int power) {
        super(name, age);
        this.power = power;
    }

    public void run(){
        System.out.println("빨리 달리다.");
    }
}
