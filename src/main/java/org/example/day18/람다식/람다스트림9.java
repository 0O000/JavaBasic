package org.example.day18.람다식;

import java.util.Arrays;
import java.util.List;

public class 람다스트림9 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("java", "lambda", "stream", "example");
        // 각 문자열의길이를계산하여출력
        words.stream().map(String::length).forEach(System.out::println);
    }
}