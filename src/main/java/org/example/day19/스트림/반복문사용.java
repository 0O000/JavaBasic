package org.example.day19.스트림;

import java.util.Arrays;

public class 반복문사용 {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};
        boolean result = Arrays.stream(intArr).allMatch(x -> x >=3);
        if(result){
            System.out.println("모두 3이상입니다.");
        }
        Arrays.stream(intArr)
                .filter(value -> value % 2 == 0)
                .forEach(value -> System.out.println(value));
        System.out.println("===================");
        int sum = Arrays.stream(intArr)
                .filter(value -> value % 2 == 0)
                .peek(value -> System.out.println(value)).sum(); //중간 결과 출력
        System.out.println("===================");
        System.out.println(sum);
    }
}
