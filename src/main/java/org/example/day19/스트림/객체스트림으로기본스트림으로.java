package org.example.day19.스트림;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class 객체스트림으로기본스트림으로 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(100, 200, 300);
        List<Double> list2 = Arrays.asList(100.0, 200.0, 300.0);

        //스트림으로 만들어서
        OptionalDouble avg1 = list.stream().mapToInt(Integer::intValue).average();
        if (avg1.isPresent()) {
            System.out.println("평균: " + avg1.getAsDouble());
        } else {
            System.out.println("평균을 구할 수 없음.");
        }

        double avg2 = list2.stream().mapToDouble(Double::valueOf).average().orElse(0.0);
        System.out.println(avg2);

        list2.stream().mapToDouble(Double::valueOf).average().ifPresent(x -> System.out.println(x));
    }
}
