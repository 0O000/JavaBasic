package org.example.day18.문제_심화;

import java.util.ArrayList;
import java.util.OptionalDouble;
import java.util.Random;
import java.util.stream.Stream;

public class Q3_람다_스트림 {
    public static void main(String[] args) {
        //-100부터 100까지의 랜덤한 숫자가 100개있는 리스트 구현
        Random r = new Random();
        ArrayList<Integer> randomArray = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            randomArray.add(r.nextInt(-100, 100));
        }
        //양수만 필터링합니다.
        System.out.println("양수만");
        randomArray.stream().filter(x -> x >0).forEach(System.out::println);
        //각 수의 제곱값을 계산합니다.
        System.out.println("각 수의 제곱값");
        randomArray.stream().map(x -> x * x).forEach(System.out::println);
        //제곱값이 1000을 초과하는 수만을 추출합니다.
        System.out.println("제곱값 1000 초과");
        randomArray.stream().filter(x -> x * x > 1000).map(x -> x * x).forEach(System.out::println);
        //최종적으로 추출된 수들의 평균값을 계산합니다.
        OptionalDouble average = randomArray.stream().mapToInt(Integer::intValue).average();
        System.out.println("평균");
        System.out.println(average.getAsDouble());
    }
}
