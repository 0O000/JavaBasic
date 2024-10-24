package org.example.day18.문제;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Q7_람다_스트림 {
    public static void main(String[] args) {
        List<String> numbers = Arrays.asList("사과", "바나나", "포도", "바나나", "멜론");
        List<String> strings = Arrays.asList("apple", "good", "grape", "ice", "melon");
        Stream<String> distinct = numbers.stream().distinct();
        System.out.println(Arrays.toString(distinct.toArray()));
        strings.stream().filter(x -> x.length() >= 5).forEach(System.out::println);
    }
}
