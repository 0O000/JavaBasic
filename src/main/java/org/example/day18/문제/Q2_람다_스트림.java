package org.example.day18.문제;

import java.util.Arrays;
import java.util.List;

public class Q2_람다_스트림 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.stream().filter(x -> x > 3).forEach(System.out::println);
        numbers.stream().map(x -> x * 10).forEach(System.out::println);
    }
}
