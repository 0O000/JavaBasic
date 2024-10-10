package org.example.day8.class사용;

import org.example.day8.class만들기.계산기2;

import java.util.Arrays;

public class 계산기2사용 {
    public static void main(String[] args) {
        계산기2 cal = new 계산기2();
        //계산기2에 있는 모든 메서드를 호출하여
        //변수에 넣은 후, 출력
        System.out.println(Arrays.toString(cal.add()) + " " +
                cal.add(1, 2) + " " +
                cal.add(1, 2.5) + " " +
                cal.add(1, 3) + " " +
                cal.add(3.3, 2.4)
        );
        System.out.println("오늘은 " + cal.call() + "일 입니다.");
    }
}