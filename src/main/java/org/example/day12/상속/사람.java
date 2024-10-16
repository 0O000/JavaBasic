package org.example.day12.상속;

public class 사람 extends Object {
    char gender;
    String name;
    int age;

    public 사람(char gender, String name, int age) {
        this.gender = gender;
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("먹다.");
    }

    public void sleep(){
        System.out.println("잠자다.");
    }
}
