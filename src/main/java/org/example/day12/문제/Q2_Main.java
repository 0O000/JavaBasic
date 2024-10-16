package org.example.day12.문제;

public class Q2_Main {
    public static void main(String[] args) {
        Q2_Thread1 thread1 = new Q2_Thread1();
        Q2_Thread2 thread2 = new Q2_Thread2();
        Q2_Thread3 thread3 = new Q2_Thread3();
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
