package org.example.day12.문제;

public class Q2_Thread1 extends Thread {
    @Override
    public void run() {
        for (int i = 500; i > 0; i--) {
            System.out.println(i);
        }
    }
    public synchronized void start() {
        super.start();
    }
}
