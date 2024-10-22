package org.example.day16.인터페이스;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class 문자판독기 {
    public static void main(String[] args) {
        JFrame f = new JFrame("문자판독기");
        f.setSize(300, 500);
        f.setLayout(new FlowLayout());

        Font font = new Font("궁서", Font.BOLD, 30);

        JLabel label = new JLabel("문장을 넣으세요");
        JTextArea area = new JTextArea(7, 10);
        area.setAutoscrolls(true);
        area.setLineWrap(true);
        JButton b1 = new JButton("Click");
        JButton b2 = new JButton("Pad Color");
        JButton b3 = new JButton("Text Color");
        label.setFont(font);
        area.setFont(font);
        b1.setFont(font);
        b2.setFont(font);
        b3.setFont(font);

        f.add(label);
        f.add(area);
        f.add(b1);
        f.add(b2);
        f.add(b3);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = area.getText();
                JOptionPane.showMessageDialog(f, "글자수는 " + text.length());
                area.setText("");
            }
        });
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectColor = JOptionPane.showInputDialog("배경 색상을 입력하세요\n1.흰색 2.파란색 3.노란색");
                if (selectColor.equals("1")) {
                    area.setBackground(Color.WHITE);
                }
                if (selectColor.equals("2")) {
                    area.setBackground(Color.BLUE);
                }
                if (selectColor.equals("3")) {
                    area.setBackground(Color.YELLOW);
                }
            }
        });
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectColor = JOptionPane.showInputDialog("글자 색상을 입력하세요\n1.흰색 2.파란색 3.노란색");
                if (selectColor.equals("1")) {
                    area.setForeground(Color.WHITE);
                }
                if (selectColor.equals("2")) {
                    area.setForeground(Color.BLUE);
                }
                if (selectColor.equals("3")) {
                    area.setForeground(Color.YELLOW);
                }
            }
        });
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
