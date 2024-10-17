package org.example.day13.문제;

public class Q1_EvenThread extends Thread {
    public void run() {
        for (int i = 100; i < 500; i++) {
            if(i % 2 == 0){
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public synchronized void start() {
        super.start();
    }
}
