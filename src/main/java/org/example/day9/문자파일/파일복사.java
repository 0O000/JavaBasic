package org.example.day9.문자파일;

import java.io.*;

public class 파일복사 {
    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("c:/data/공부.txt");
            OutputStream os = new FileOutputStream("c:/data/공부1.txt");
            is.transferTo(os); //복사할파일.transferTo(복사될파일)
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}