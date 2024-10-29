package org.example.day21.알고리즘.스트링;

import java.util.Arrays;

public class 문자열내림차순배치하기 {
    public static void main(String[] args) {
        String s = "Zbckasdof";
        //소문자 z 부터 대문자 A로 내림차순 하기
        //오름차순정렬 후 뒤집기
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        StringBuilder sb = new StringBuilder(new String(chars));
        String result = sb.reverse().toString();
        System.out.println(result);
    }
}
