package org.example.day3.array;

import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {
        //우리가족 정보 배열
        //5명, 이름, 나이, 키, 성별, 아침여부
        String[] name = {"홍길동", "김길동", "이길동", "박길동", "정길동"};
        int[] age = {30, 28, 26, 23, 22, 20};
        double[] height = {173.5, 174.5, 176.3, 173, 181};
        String[] gender = {"남자", "여자", "남자", "여자", "남자"};
        boolean[] food = {true, false, false, true, true};

        for (int i = 0; i < name.length; i++) {
            System.out.println("이름: " + name[i] + " 나이: " + age[i] + " 키: " + height[i] + " 성별: " + gender[i] + " 아침식사: " + food[i]);
        }

        for (String s : name) {
            System.out.println(s);
        }

        System.out.println(Arrays.toString(name) + " " + Arrays.toString(age) + " " + Arrays.toString(height) + " " + Arrays.toString(gender) + " " + Arrays.toString(food));
    }
}
