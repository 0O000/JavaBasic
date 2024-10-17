package org.example.day13.문제;

import java.util.Date;

public class Q1_TimeThread extends Thread {
    public void run() {
        for (int i = 0; i < 500; i++) {
            Date now = new Date();
            System.out.println(now.getHours() + " " + now.getMinutes() + " " + now.getSeconds());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public synchronized void start() {
        super.start();
    }
}
