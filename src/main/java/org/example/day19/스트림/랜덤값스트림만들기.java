package org.example.day19.스트림;

import java.util.Random;
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
    }
}
