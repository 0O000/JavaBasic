package org.example.day7.class사용하기;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class 일기쓰기화면 {
    public void open() {
        JFrame frame = new JFrame();
        frame.setSize(350, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Font font = new Font("굴림", Font.BOLD, 20);

        JLabel today = new JLabel();
        today.setFont(font);
        today.setText("오늘의 날짜");
        JLabel title = new JLabel();
        title.setFont(font);
        title.setText("오늘의 제목");
        JLabel content = new JLabel();
        content.setText("오늘의 내용");
        content.setFont(font);

        JTextField todayText = new JTextField(15);
        todayText.setFont(font);
        todayText.setForeground(Color.BLUE);
        JTextField titleText = new JTextField(15);
        titleText.setFont(font);
        titleText.setForeground(Color.BLUE);
        JTextField contentText = new JTextField(15);
        contentText.setFont(font);
        contentText.setForeground(Color.BLUE);

        JButton save = new JButton();
        save.setText("파일에 일기 저장");
        save.setFont(font);
        save.setBackground(Color.MAGENTA);

        FlowLayout flowLayout = new FlowLayout();
        frame.setLayout(flowLayout);
        frame.getContentPane().setBackground(Color.YELLOW);
        frame.add(today);
        frame.add(todayText);
        frame.add(title);
        frame.add(titleText);
        frame.add(content);
        frame.add(contentText);
        frame.add(save);

        save.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String today = todayText.getText();
                String title = titleText.getText();
                String content = contentText.getText();
                System.out.println(today + " " + title + " " + content);

                //파일을 만드는 부품
                //가지고 온 데이터 파일에 저장

                //파일로 만들어 주고 String으로 데이터를 저장해주는 기능
                try {
                    FileWriter fw = new FileWriter(today + ".txt");
                    fw.write(today + "\n");
                    fw.write(title + "\n");
                    fw.write(content + "\n");
                    fw.close();
                    JOptionPane.showMessageDialog(frame, "성공적으로 저장됐습니다!");
                } catch (IOException ex) {
                    System.out.println("파일과 관련된 문제가 생김.");
                }
            }
        });
        frame.setVisible(true);
    }
}