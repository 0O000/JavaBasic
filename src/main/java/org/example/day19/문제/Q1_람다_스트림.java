package org.example.day19.문제;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Q1_람다_스트림 {
    public static void main(String[] args) {
        //1. 정수값 100개를 111~222까지 랜덤하게 스트림을 만들어서
        //최대값, 최소값, 합계, 평균을 구하시오.
        Random r = new Random();
        int[] randomArray= r.ints(100, 111, 222).toArray();
        System.out.println("최대값: " +Arrays.stream(randomArray).max().getAsInt()
                + "\n최솟값: " + Arrays.stream(randomArray).min().getAsInt()
                + "\n합계: " + Arrays.stream(randomArray).sum()
                + "\n평균: " + Arrays.stream(randomArray).average().getAsDouble()
        );

        //2. 실수값 200개를 11.1~55.5까지 랜덤하게 스트림을 만들어서
        //전체 개수, 맨 앞에 있는 값, 평균을 구하시오.
        double[] randomArrayDouble = r.doubles(200, 11.1, 55.5).toArray();
        System.out.println("맨 앞의 값: " + Arrays.stream(randomArrayDouble).findFirst().getAsDouble()
                + "\n평균: " + Arrays.stream(randomArrayDouble).average().getAsDouble()
        );
        //3. 먹고 싶은 음식 7개를 List<String>에 넣은 후,
        //스트림으로 만들고 글자가 3글자 이상인 것 들만 모아서
        //프린트
        //4. 가고 싶은 곳 5개(산 2개 이상 넣음)를 String[]에 넣은 후,
        //스트림으로 만들고 글자가 "산"으로 끝나는 것을 모아 중간에 한번 출력 후
        //List<String>으로 모은 후 list를 출력
        //5. List<Double> list = Arrays.asList(11.1, 22.2, 33.3, 44.4, 55.5);를 스트림으로 만들어
        //최대값, 최소값, 합계, 평균을 구하시오.
        //6. List<Integer> list2 = Arrays.asList(55, 66, 88, 99, 99, 55, 100);을 스트림으로 만들어
        //중복을 제거후, 오름차순으로 정렬한 후 최소값을 구하시오.
    }
}
