package org.example.day18.문제;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class Q8_람다_스트림 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr2 = {5, 3, 10, 40, 2};
        int[] arr3 = {1, 2, 2, 5, 5, 6, 7, 7, 9, 10};
        Arrays.stream(arr).filter(x -> x % 2 == 1).forEach(System.out::println);
        OptionalInt max = Arrays.stream(arr2).max();
        System.out.println(max.getAsInt());
        Arrays.stream(arr3).filter(x -> x >= 5).distinct().forEach(System.out::println);
    }
}
