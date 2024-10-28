package org.example.day19.문제_심화;

public class Q8_reflection {
    private String name;
    private int age;

    public Q8_reflection(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayHello() {
        System.out.println("Hello, my name is " + name + " and I am " + age +
                " years old.");
    }

    private void sayGoodbye() {
        System.out.println("Goodbye from " + name);
    }
}

