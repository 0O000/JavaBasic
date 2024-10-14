package org.example.day10.문제;

public class Q3 {
    String name;
    int age;
    String gender;
    static int sumAge;
    static int count;

    public Q3(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        count++;
        sumAge += age;
    }

    @Override
    public String toString() {
        return "Q3{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
