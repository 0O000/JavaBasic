package org.example.day18.문제;

import java.util.Arrays;
import java.util.List;

public class Q3_람다_스트림 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "Hi", "smile");
        words.stream().filter(x -> x.length() > 4).forEach(System.out::println);
        words.stream().map(x -> x + "님").forEach(System.out::println);
    }
}
