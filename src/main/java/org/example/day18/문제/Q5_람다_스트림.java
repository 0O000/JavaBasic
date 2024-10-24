package org.example.day18.문제;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Q5_람다_스트림 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4, 4, 5, 5, 6, 8};
        double[] arr2 = {5.0, 3.0, 1.0, 33.0, 35.0};
        String[] arr3 = {"정신과", "내과", "신경과", "정형외과"};
        IntStream distinct = Arrays.stream(arr).filter(x -> x > 3).distinct();
        System.out.println(Arrays.toString(distinct.toArray()));
        double sum = Arrays.stream(arr2).sum();
        System.out.println(sum);
        Arrays.stream(arr3).map(x -> x + "사무실").forEach(System.out::println);
    }
}
