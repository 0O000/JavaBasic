package org.example.day18.람다식;

import java.util.Arrays;
import java.util.List;

public class 람다스트림4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        // 각 숫자에 2를 곱한후 출력
        numbers.stream()
                .map(n -> n * 2)
                .forEach(System.out::println);
    }
}