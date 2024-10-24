package org.example.day18.람다식;

import java.util.Arrays;
import java.util.List;

public class 람다스트림6 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");
        // 각 문자열의첫 글자추출하여출력
        words.stream().map(word -> word.substring(0,1)).forEach(System.out::println);
    }
}