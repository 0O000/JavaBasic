package org.example.day3.array;

import java.util.ArrayList;

public class Array1 {
    public static void main(String[] args) {
        //공간을 여려개 만들때 처음 값을 모르는 경우
        //유한 공간 (개수가 정해져있을때), 동일한 타입일 때
        int[] arr = new int[5]; //{0, 0, 0, 0, 0} 초기화된 값을 생성
        //첫번째 값 프린트
        // -> arr안에 주소가 가르키고 있는 첫번째 공간 arr[0]
        System.out.println("arr의 첫번째 값: " + arr[0]);
        System.out.println("arr의 두번째 값: " + arr[1]);

        arr[0] = 30;
        System.out.println("arr의 첫번째 값: " + arr[0]);
        //공간을 여러개 만들때 값을 아는 경우
        int[] arr2 = {100, 200, 300, 400, 500};
        System.out.println("arr2의 첫번째 값: " + arr2[0]);
        System.out.println(arr2.length);
    }
}
