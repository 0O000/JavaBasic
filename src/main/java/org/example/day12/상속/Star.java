package org.example.day12.상속;

public class Star extends Thread {
    @Override
    public void run() {
        for(int i = 0; i < 5000; i++){
            System.out.print("*");
        }
    }

    @Override
    public synchronized void start() {
        super.start();
    }
}
