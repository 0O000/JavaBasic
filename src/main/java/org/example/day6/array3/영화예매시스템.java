package org.example.day6.array3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class 영화예매시스템 {
    static int count = 0;
    static String seatNo = "";
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(560, 750);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout flow = new FlowLayout();
        f.setLayout(flow); //add한 순서대로 뒤에다 붙여준다.
        JButton b1 = new JButton();
        b1.setBackground(Color.YELLOW);
        for (int i = 0; i < 100; i++) {
            JButton b = new JButton();
            b.setText(i + "");
            b1.setText("결제하기");
            f.add(b);

            b.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    //버튼 클릭시 실행되는 내용!
                    //버튼 클릭하면 ActionListener안에 있는 actionPerformed()라는
                    //함수가 자동 실행!
                    String s = e.getActionCommand(); //버튼 위에있는 글자를 가지고 온다.
                    seatNo = seatNo + s + " ";
                    System.out.println(s);
                    JOptionPane.showMessageDialog(f, s+"번 예매됨.");
                    b.setEnabled(false); //더이상 버튼이 안눌린다.
                    b.setBackground(Color.red); //버튼 색상이 빨강으로 바뀐다.
                    count++;
                }
            });
        }
        f.add(b1);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(f, "당신이 예매한 좌석번호는: " + seatNo + "\n" + count * 10000 + "원 결제금액");
            }
        });

        f.setVisible(true);
    }
}
