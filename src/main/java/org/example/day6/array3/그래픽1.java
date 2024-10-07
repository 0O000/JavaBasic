package org.example.day6.array3;

import javax.swing.*;
import java.awt.*;

public class 그래픽1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setTitle("그래픽 연습");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //3 x누르면 종료하기

        JButton button = new JButton();
        button.setText("나를 눌러!"); //함수, 메서드, 명령어(입력데이터)
        JButton button2 = new JButton();
        button2.setText("@@@@@@@@");

//        Jframe은 윗쪽, 아랫쪽, 가운데, 왼쪽, 오른쪽 중에서 선택할 수 있음.
        frame.add(button, BorderLayout.NORTH);
        frame.add(button2, BorderLayout.SOUTH);
//        맨끝
        frame.setVisible(true);
    }
}