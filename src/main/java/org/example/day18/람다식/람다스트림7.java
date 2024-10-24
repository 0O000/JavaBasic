package org.example.day18.람다식;

import java.util.Arrays;
import java.util.List;

public class 람다스트림7 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        // 홀수숫자의제곱구하여출력
        numbers.stream().filter(x -> x % 2 == 1)
                .map(x -> x * x)
                .forEach(System.out::println);
    }
}
