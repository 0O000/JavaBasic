package org.example.day23.스레드메서드;

class Sum {
    private int sum = 0;

    public void sum(int n) {
        sum += n;
    }

    public int getSum() {
        return sum;
    }
}


public class 문제Main1 {
    public static void main(String[] args) throws InterruptedException {

        Sum s = new Sum();

        // 스레드1은 1부터 100까지 Sum클래스의 sum메서드를 호출하여 sum변수에 더하는 처리
        Thread t1 = new Thread() {
            public void run() {
                for (int i = 0; i < 100; i++) {
                    s.sum(i);
                }
            }
        };

        // 스레드2는 2부터 200까지 Sum클래스의 sum메서드를 호출하여 sum변수에 더하는 처리
        Thread t2 = new Thread() {
            public void run() {
                for (int i = 0; i < 200; i++) {
                    s.sum(i);
                }
            }
        };

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        //최종sum값을 getSum을 통해 프린트
        System.out.println("총 합: " + s.getSum());
    }
}