package org.example.day12.상속;

public class 멀티스레드 {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        Name name = new Name();
        Star star = new Star();
//        t1.start();
//        t2.start();
        name.start();
        star.start();
//        name.run();
//        star.run();
    }
}
