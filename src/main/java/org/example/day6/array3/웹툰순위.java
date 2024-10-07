package org.example.day6.array3;

import javax.swing.*;
import java.awt.*;

public class 웹툰순위 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("웹툰 순위-네이버");
        frame.setSize(500,530);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //데이터 준비 --> 배열(같은 속성, 같은 타입, 많을 때 사용)
        String[] title = {"윈드 브레이커", "천재 타자", "펜 홀더", "위닝 샷", "낫 오버" };
        String[] img = {"//image/1.png", "//image/2.png", "//image/3.png", "//image/4.png", "//image/5.png"};
        double[] jumsu = {9.9, 8.8, 7.7, 6.6, 5.5};

        //입력, 처리, 출력 순으로 진행
        //텍스트 3개 들어갈 자리(위, 아래, 포스터 이미지)
        JLabel top = new JLabel();
        top.setText("타이틀");

        JLabel under = new JLabel();
        under.setText("평점");

        JLabel center = new JLabel();
        center.setText("포스터");

        frame.add(top, BorderLayout.NORTH);
        frame.add(under, BorderLayout.SOUTH);
        frame.add(center, BorderLayout.CENTER);
        //맨 끝!!
        frame.setVisible(true);
    }
}