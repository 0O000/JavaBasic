package org.example.day15.참조형형변환;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class 신호등2 {
    static JFrame f = new JFrame();
    public static void main(String[] args) {
        f = new JFrame();
        f.getContentPane().setBackground(Color.BLACK);
        f.setSize(618, 692);
        f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

        JButton btnNewButton = new JButton("빨강신호");
        btnNewButton.setFont(new Font("굴림", Font.BOLD, 30));
        btnNewButton.setBackground(Color.RED);
        f.getContentPane().add(btnNewButton);

        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                show("r");
            }
        });

        JButton btnNewButton_1 = new JButton("노랑신호");
        btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 30));
        btnNewButton_1.setBackground(Color.YELLOW);
        f.getContentPane().add(btnNewButton_1);

        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                show("y");
            }
        });

        JButton btnNewButton_2 = new JButton("파랑신호");
        btnNewButton_2.setFont(new Font("굴림", Font.BOLD, 30));
        btnNewButton_2.setBackground(Color.BLUE);
        f.getContentPane().add(btnNewButton_2);

        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                show("g");
            }
        });

        f.setDefaultCloseOperation(3);
        f.setVisible(true);
    }

    public static void show(String filename){
        JLabel img = new JLabel();
        ImageIcon icon = new ImageIcon("src/main/java/org/example/day15/image/" + filename + ".png");
        img.setIcon(icon);
        f.add(img);
        f.setVisible(true);
    }
}
