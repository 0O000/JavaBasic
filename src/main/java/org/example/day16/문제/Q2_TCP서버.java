package org.example.day16.문제;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Q2_TCP서버 {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(9000);
        System.out.println("TCP 서버 소캣 시작됨");
        System.out.println("클라이언트의 연결을 기다리는 중....");
        int count = 0;
        while(true){
            Socket socket = server.accept();
            count++;
            System.out.println(count + "번");
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            out.print("i am a java programmer!!");
            out.close();
            socket.close();
        }
    }
}
