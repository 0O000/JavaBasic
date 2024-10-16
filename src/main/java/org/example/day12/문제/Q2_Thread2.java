package org.example.day12.문제;

import java.util.Date;

public class Q2_Thread2 extends Thread {
    @Override
    public void run() {
        Date now = new Date();
        for (int i = 0; i < 3000; i++) {
            System.out.println(now);
        }
    }
    public synchronized void start() {
        super.start();
    }
}
