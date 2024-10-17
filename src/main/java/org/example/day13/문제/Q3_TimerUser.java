package org.example.day13.문제;

import javax.swing.*;
import java.util.Timer;

public class Q3_TimerUser extends JFrame {

    public Q3_TimerUser() {
        setSize(300, 300);
        JLabel l = new JLabel("나에요");

        setVisible(true);
    }

    public static void main(String[] args) {
        Timer timer = new Timer();
        Q3_TimerTest task = new Q3_TimerTest();
        System.out.println("5초동안 게임을 할 수 있습니다.");
        timer.schedule(task, 5000);
    }
}
