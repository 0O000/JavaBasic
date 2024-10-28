package org.example.day20.문제;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
//        1. { 11, 55, 33, 22, 44 } 중 두 수를 곱해서 나올 수 있는 최대값은?
        int[] arr = { 11, 55, 33, 22, 44 };
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                list.add(arr[i] * arr[j]);
            }
        }
        System.out.println(Collections.max(list));

//        2. { 22, -88, -4, 11, 55} 중 두 수를 곱해서 나올 수 있는 최대값은?
        int[] arr1 = { 22, -88, -4, 11, 55};
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                list.add(arr[i] * arr[j]);
            }
        }
        System.out.println(Collections.max(list));
//        3. {66, 33, 55, 22, 11} 중 크기를 기준으로 중앙값은?
        int[] arr3 = {66, 33, 55, 22, 11};
        Arrays.sort(arr3);
//        배열의 요소의 길이가 홀수일때는 가운데 있는 값을 찾음.
        System.out.println(arr3[arr3.length/2]);
//        4. {66, 33, 55, 22, 11, 66} 중 크기를 기준으로 중앙값은?
//        배열의 요소의 길이가 짝수일때는 가운데 있는 값들을 찾아
//        더한 후 2로 나누어서 찾음.
        int[] arr4 = {66, 33, 55, 22, 11, 66};
        Arrays.sort(arr4);
        System.out.println(((arr4[arr4.length/2]) + (arr4[(arr4.length/2) - 1])) / 2);
//        5. 중복된 숫자 개수문제(p130)
//        6. 점의 위치 구하기 문제(p129)
//        7. 머쓱이보다 키 큰 사람(p127)
//        8. 배열의 평균값(p115)
//        9. 옷가게 할인 받기(p112)
//        10. 피자 나눠 먹기(2)(p111)
//        programmers 패키지에 있음
    }
}
