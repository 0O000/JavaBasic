package org.example.day18.람다식;

import java.util.Arrays;
import java.util.List;

public class 람다스트림8 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "fig");
        // 'a'를 포함하는문자열만필터링하여출력
        words.stream().filter(x -> x.contains("a")).forEach(System.out::println);

    }
}