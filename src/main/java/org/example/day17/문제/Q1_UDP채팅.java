package org.example.day17.문제;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Q1_UDP채팅 extends JFrame {
    JTextArea list;

    Q1_UDP채팅() {
        System.out.println("생성자 시작.");

        setTitle("메신저A");
        setSize(500, 500);
        getContentPane().setBackground(Color.pink);

        list = new JTextArea();
        JTextField input = new JTextField();
        setLayout(new BorderLayout());
        add(list, BorderLayout.CENTER);
        add(input, BorderLayout.SOUTH);
        list.setBackground(Color.pink);
        Font font = new Font("굴림", Font.BOLD, 30);
        list.setFont(font);
        input.setBackground(Color.BLUE);
        input.setForeground(Color.white);
        input.setFont(font);
        list.setLineWrap(true);
        list.setAutoscrolls(true);
        list.setEditable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        input.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String data = input.getText();

                list.append("나: " + data + "\n");
                input.setText("");

                try {
                    DatagramSocket socket = new DatagramSocket();
                    byte[] data2 = data.getBytes();
                    InetAddress ip = InetAddress.getByName("192.168.60.58");
                    DatagramPacket packet = new DatagramPacket(data2, data2.length, ip, 5555);
                    socket.send(packet);
                    socket.close();
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            }
        });
        setVisible(true);
    }

    public void process() throws Exception {

        DatagramSocket socket = new DatagramSocket(7777);
        while (true) {
            byte[] data = new byte[10];
            DatagramPacket packet = new DatagramPacket(data, data.length);
            socket.receive(packet);
            System.out.println(socket.getLocalPort());
            list.append("너: " + new String(data) + "\n");
        }
    }

    public static void main(String[] args) throws Exception {
        Q1_UDP채팅 q1 = new Q1_UDP채팅();
        q1.process();
    }
}

//192.168.60.22
//192.168.60.58