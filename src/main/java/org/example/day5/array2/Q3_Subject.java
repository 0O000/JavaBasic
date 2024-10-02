package org.example.day5.array2;

import java.util.Arrays;

public class Q3_Subject {
    public static void main(String[] args) {

        String all = "국어, 영어,  수학 , 컴퓨터";
        int index = 0;
        int under = 0;
        //과목수
        String[] arr = all.split(", ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].trim();
        }
        System.out.println("과목수: " + arr.length);
        //컴퓨터 위치 및 3글자 미만 과목수
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals("컴퓨터")){
                index = i;
            }
            if(arr[i].length() < 3){
                under++;
            }
        }
        System.out.println("컴퓨터의 위치: " + index);
        System.out.println("과목명이 3글자 미만인 과목수: " + under);

    }
}
