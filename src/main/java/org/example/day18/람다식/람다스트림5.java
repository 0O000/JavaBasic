package org.example.day18.람다식;

import java.util.Arrays;
import java.util.List;

public class 람다스트림5 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(-3, 5, -1, 7, -8, 2);
        // 음수숫자만필터링하여출력
        numbers.stream().filter(x -> x < 0).forEach(System.out::println);
    }
}