package org.example.day17.문제;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.Socket;
import java.util.HashSet;
import java.util.Set;
public class ChatClient {
    private static final String SERVER_ADDRESS = "192.168.60.58";
    private static final int SERVER_PORT = 7777;
    private static Socket socket;
    private static PrintWriter out;
    private static String nickname;
    private static Set<String> mutedUsers = new HashSet<>(); // 금지된 사용자 목록
    private static JTextArea textArea;
    private static JTextField inputField;
    public static void main(String[] args) {
        try {
            socket = new Socket(SERVER_ADDRESS, SERVER_PORT);
            out = new PrintWriter(socket.getOutputStream(), true);
            nickname = JOptionPane.showInputDialog("닉네임을 입력하세요:");
            out.println(nickname);
            JFrame frame = new JFrame("채팅방");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(500, 400);
            textArea = new JTextArea();
            textArea.setEditable(false);
            inputField = new JTextField();
            inputField.setPreferredSize(new Dimension(500, 30));
            frame.getContentPane().add(new JScrollPane(textArea), BorderLayout.CENTER);
            frame.getContentPane().add(inputField, BorderLayout.SOUTH);
            inputField.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String message = inputField.getText();
                    inputField.setText("");
                    if (mutedUsers.contains(nickname)) {
                        JOptionPane.showMessageDialog(frame, "당신은 금지된 사용자입니다.");
                        return;
                    }
                    out.println(message);
                }
            });
            new Thread(new IncomingMessageHandler()).start();
            frame.setVisible(true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static class IncomingMessageHandler implements Runnable {
        @Override
        public void run() {
            try {
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String message;
                while ((message = in.readLine()) != null) {
                    textArea.append(message + "\n");
                    textArea.setCaretPosition(textArea.getDocument().getLength());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}