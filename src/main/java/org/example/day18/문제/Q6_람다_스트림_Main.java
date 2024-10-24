package org.example.day18.문제;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Q6_람다_스트림_Main {
    public static void main(String[] args) {
        List<Q6_람다_스트림_학생> list = Arrays.asList(
                new Q6_람다_스트림_학생("hong", 100),
                new Q6_람다_스트림_학생("kim", 90),
                new Q6_람다_스트림_학생("jung", 80),
                new Q6_람다_스트림_학생("park", 70),
                new Q6_람다_스트림_학생("moon", 95)
        );
        OptionalDouble optionalValue = list.stream().mapToInt(Q6_람다_스트림_학생::getScore).average();
        if(optionalValue.isEmpty()){
            System.out.println("존재하지 않아 평균값을 구할 수 없음");
        }else{
            optionalValue.ifPresent(value -> System.out.println("3번에서 구한 평균 출력: " + value));
        }
    }
}