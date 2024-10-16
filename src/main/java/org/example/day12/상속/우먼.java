package org.example.day12.상속;

public class 우먼 extends 사람{
    int walk;

    public 우먼(char gender, String name, int age, int walk) {
        super(gender, name, age);
        this.walk = walk;
    }
}
