package org.example.day12.상속;

public class 원더우먼 extends 우먼{
    int high;

    public 원더우먼(char gender, String name, int age, int walk, int high) {
        super(gender, name, age, walk);
        this.high = high;
    }
}
