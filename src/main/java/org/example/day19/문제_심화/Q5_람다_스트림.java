package org.example.day19.문제_심화;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Q5_람다_스트림 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30);
//    1. 각 숫자에 3을 곱한다.
//    2. 그 결과에서 짝수만 필터링한다.
//    3. 남은 숫자들을 각각의 숫자의 제곱근으로 변환한다.
//    4. 변환된 수들을 내림차순으로 정렬한다.
//    5. 최종 리스트에서 최대 5개의 요소만을 포함하는 새로운 리스트를 반환한다.
        List<Double> list = numbers.stream()
                .map(integer -> integer * 3)
                .filter(integer -> integer % 2 == 0)
                .map(Math::sqrt)
                .sorted(Comparator.reverseOrder())
                .limit(5)
                .collect(Collectors.toList());
        System.out.println(list);
    }
}
