package org.example.day19.스트림;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class 랜덤값스트림만들기 {
    public static void main(String[] args) {
        System.out.println(
                IntStream.rangeClosed(1, 100).sum()
        );
        System.out.println(
                //마지막 값을 포함하지 않음.
                IntStream.range(1, 100).sum()
        );

        Random r = new Random();

        int result = r.ints(100, 1, 100).distinct().sum();
        System.out.println(result);

        r.ints(100, 1, 100).sorted().forEach(System.out::println);
        DoubleStream ds = r.doubles(2000, 0, 100);

        long count = ds.distinct().count();
        System.out.println("중복제거한 개수: " + count);
        r.doubles(2000, 0, 100).distinct().sorted().forEach(System.out::println);

    }
}
