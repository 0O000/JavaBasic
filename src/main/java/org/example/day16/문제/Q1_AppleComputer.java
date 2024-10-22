package org.example.day16.문제;

public class Q1_AppleComputer implements Q1_Computer{
    @Override
    public void start() {
        System.out.println("애플 컴퓨터---------------");
        System.out.println("애플 컴퓨터가 시작되었습니다.");
    }

    @Override
    public void shutDown() {
        System.out.println("애플 컴퓨터는 절정기능이 뛰어나 일정 시간이 지나면 showdown됩니다.");
    }

    @Override
    public void restart() {
        System.out.println("애플 컴퓨터는 화면 위쪽 재시작을 클릭하면 재시작이 됩니다.");
    }
}
