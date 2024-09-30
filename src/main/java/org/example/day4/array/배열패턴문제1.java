package org.example.day4.array;

import java.util.Arrays;
import java.util.Random;

public class 배열패턴문제1 {
    public static void main(String[] args) {
        //1. 배열을 만들어서 나중에 반복문으로 데이터 추가하는 경우
        //1-1. length가 10인 int배열 생성
        //1-2. Random을 이용하여 값을 넣기(범위 1~100, r.nextInt(100) + 1)
        //     씨드값은 55
        //1-3. 생성된 배열 요소 전체 출력
        Random r = new Random(55);
        int[] random = new int[10];

        for (int i = 0; i < random.length; i++) {
            random[i] = r.nextInt(100 + 1);
        }

        for (int i = 0; i < random.length; i++) {
            System.out.println(random[i]);
        }

        //2. 배열에 있는 값을 꺼내어 누적
        //2-1. 감소하며 누적하는 변수 minus 선언하여 초기화
        //2-2. 배열에 있는 값을 꺼내어 계속 감소
        //2-3 minus값 출력
        int minus = 0;
        for (int i = random.length - 1; i >= 0; i--) {
            System.out.println(random[i]);
        }

        //3. 배열에 있는 값을 반복해서 처리하는데 조건이 있는 경우
        //3-1. 더해서 누적하는 함수 sum 선언하여 초기화
        //3-2. 배열에 있는 값 중 58보다 큰 것만 누적하여 출력
        //3-3. sum 값 출력
        int sum = 0;
        for (int i = 0; i < random.length; i++) {
            if(random[i] > 58){
                System.out.println(random[i]);
            }
        }

        //4. 배열에 있는 값을 가지고 위치를 찾는 경우
        //4-1. 배열내에 80보다 큰 값의 위치를 맨 앞부터 하나만 찾아 위치 프린트
        //4-2. 80보다 큰 값을 찾으면 반복문 종료

    }
}