package org.example.day23.스레드기본;

public class Thread3 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("$");
            try {
                sleep(500);
            } catch (Exception e) {
                System.out.println("스레드 재우기를 시도하다 문제 발생함");
            }
        }
    }
}
