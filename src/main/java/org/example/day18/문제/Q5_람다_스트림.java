package org.example.day18.문제;

import java.util.Arrays;
import java.util.List;

public class Q5_람다_스트림 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("파인애플", "송아지", "양", "스마일", "소");
        List<String> images = Arrays.asList("1.png", "2.png", "3.jpeg", "4.jpeg");
        strings.stream().filter(x -> x.length() == 1).forEach(System.out::println);
        images.stream().filter(x -> x.endsWith("jpeg")).forEach(System.out::println);
    }
}
