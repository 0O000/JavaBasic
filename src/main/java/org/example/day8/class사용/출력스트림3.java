package org.example.day8.class사용;

import java.io.*;

public class 출력스트림3 {
    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("c:/data/imsi1.db");
            while (true) {
                int data = is.read();
                if (data == -1) break;
                System.out.println(data);
            }

            is.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace(); //자세하게 프린트
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
