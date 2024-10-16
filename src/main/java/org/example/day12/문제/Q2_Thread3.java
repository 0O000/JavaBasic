package org.example.day12.문제;

public class Q2_Thread3 extends Thread {
    String[] foods = {"a", "b", "c", "d", "e", "f"};

    @Override
    public void run() {
        for(String s : foods) {
            try{
                System.out.println(s);
                Thread.sleep(1000);
            }catch (Exception e){

            }
        }
    }
    public synchronized void start() {
        super.start();
    }
}
