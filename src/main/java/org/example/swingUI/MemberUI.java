package org.example.swingUI;

import javax.swing.*;
import java.awt.*;

public class MemberUI extends JFrame {
    JLabel top, l1, l2, l3, l4;
    JTextField t1, t2, t3, t4;
    JButton b1, b2, b3;

    MemberUI(){
        setTitle("Member UI");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        top = new JLabel("Member");
        l1 = new JLabel("ID");
        l2 = new JLabel("PW");
        l3 = new JLabel("Name");
        l4 = new JLabel("Tel");

        t1 = new JTextField(10);
        t2 = new JTextField(10);
        t3 = new JTextField(10);
        t4 = new JTextField(10);

        b1 = new JButton("회원가입");
        b2 = new JButton("회원수정");
        b3 = new JButton("회원검색");

        Font font = new Font("굴림", Font.BOLD, 20);
        top.setFont(new Font("굴림", Font.BOLD, 50));

        l1.setFont(font);
        l2.setFont(font);
        l3.setFont(font);
        l4.setFont(font);
        t1.setFont(font);
        t2.setFont(font);
        t3.setFont(font);
        t4.setFont(font);
        b1.setFont(font);
        b2.setFont(font);
        b3.setFont(font);

        add(top);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(l4);
        add(t4);
        add(b1);
        add(b2);
        add(b3);

        getContentPane().setBackground(Color.GREEN);

        setVisible(true);
    }

    public static void main(String[] args) {
        new MemberUI();
    }
}
