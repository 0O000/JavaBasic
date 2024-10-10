package org.example.day8.class사용;

import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class 파일에저장2 {
    public static void main(String[] args) {
        //주말동안 할 일 입력받아 저장
        //할 일이 "운동"이면 파일명은 "운동.txt"
        //저장 위치는 c:/data/운동.txt로 생성되게 하시오.
        //입력은 2회 받음.
        //1. 주말동안 할 일은?(예, 운동, 코딩, 여행 등)
        //                  운동
        //2. 구체적인 내용 입력?(예, 장소-시간-내용을 입력)
        //                  잠실운동장-2시간-뛰기
        //파일은 3개 이상 만들어지도록 처리
        for (int i = 0; i < 3; i++) {
            String doIt = JOptionPane.showInputDialog("주말에 할 일: ");
            String doDetail = JOptionPane.showInputDialog("장소-시간-내용을 입력해주세요: ");
            String[] doing = doDetail.split("-");
            try {
                FileWriter file = new FileWriter("c:\\data\\" + doIt + ".txt");
                file.write(doIt + "\n");
                for (int j = 0; j < doing.length; j++) {
                    file.write(doing[j] + "\n");
                }
                file.close();
            } catch (IOException e) {
                System.out.println("파일 다룰때 에러가 발생함.");
            }
        }
        System.out.println("저장끝~~~~~~~~~");
    }
}