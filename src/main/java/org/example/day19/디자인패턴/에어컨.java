package org.example.day19.디자인패턴;

import java.util.ArrayList;

public class 에어컨 implements 관찰자 {

    String[] manager = {"Alice", "Hong", "Park"};
    private int temp;

    void setTemp(int temp) {
        for (String m : manager) {
            System.out.print(m + "님 ");
            update(temp);
        }
    }

    @Override
    public void update(int temp) {
        System.out.println(temp + "도가 변경되었습니다.");
    }
}