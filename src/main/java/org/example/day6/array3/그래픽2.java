package org.example.day6.array3;

import javax.swing.*;

public class 그래픽2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setTitle("그래픽 연습");

        JButton button = new JButton();
        button.setText("나를 눌러!");
        frame.add(button);
        frame.setVisible(true);
    }
}
