package org.example.day12.상속;

public class Name extends Thread {
    @Override
    public void run() {
        for(int i = 0; i < 5000; i++){
            System.out.print("조민호");
        }
    }

    @Override
    public synchronized void start() {
        super.start();
    }
}