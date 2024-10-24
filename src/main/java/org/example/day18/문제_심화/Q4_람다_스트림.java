package org.example.day18.문제_심화;

import java.util.Arrays;
import java.util.Random;

public class Q4_람다_스트림 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] randomArray = r.ints(500, -200, 200).toArray();
        int[] ans1 = Arrays.stream(randomArray).filter(x -> x > 0).filter(y -> y % 2 == 0).toArray();
        System.out.println("배열에서 0 이상의 짝수만을 필터링합니다.");
        System.out.println(Arrays.toString(ans1));
        double[] ans2 = Arrays.stream(ans1).mapToDouble(x -> Math.sqrt(x)).toArray();
        System.out.println("필터링된 결과에서 각 숫자의 제곱근을 구합니다.");
        System.out.println(Arrays.toString(ans2));
        
    }
}
