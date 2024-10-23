package org.example.day17.채팅;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class 메신저B extends JFrame {
    JTextArea list;

    메신저B(){
        //여기에 코드 다하면, static이 아니여서 더 좋은 코드를 만들 수 있음.
        System.out.println("생성자 시작.");

        setTitle("메신저B");
        setSize(500, 500);
        getContentPane().setBackground(Color.yellow);

        list = new JTextArea();
        JTextField input = new JTextField();
        JScrollPane pane = new JScrollPane(list);
        setLayout(new BorderLayout());
        add(pane, BorderLayout.CENTER);
        add(input, BorderLayout.SOUTH);
        //list->색, 세로 스크롤, 가로 글자넘어가는 것 방지, 글자크기 30으로 설정
        //input->색, 글자크기 30으로 설정
        list.setBackground(Color.YELLOW);
        Font font = new Font("굴림", Font.BOLD, 30);
        list.setFont(font);
        input.setBackground(Color.BLUE);
        input.setForeground(Color.white);
        input.setFont(font);
        list.setLineWrap(true);
        list.setAutoscrolls(true);
        list.setEditable(false);

        input.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String data = input.getText();
                //내가 보낼때 내용
                list.append("나: " + data + "\n");
                input.setText("");
            }
        });
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void process() throws IOException {
        //메신저가 시작하자마자 무한루프 받는거 돌아가게 해야함.
        //전화기 역할 소켓만들기
        DatagramSocket socket = new DatagramSocket(7777);
        while (true) {
            //공간 byte[], packet 만들어주기
            byte[] data = new byte[10];
            DatagramPacket packet = new DatagramPacket(data, data.length);
            socket.receive(packet);
            //상대방이 받는 내용
            list.append("너: " + new String(data) + "\n");
        }
    }

    public static void main(String[] args) throws Exception {
        메신저B m = new 메신저B();
        //메신저가 시작하자마자 무한루프 받기
        m.process();
    }
}