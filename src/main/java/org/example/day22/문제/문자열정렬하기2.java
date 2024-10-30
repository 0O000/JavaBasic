package org.example.day22.문제;

import java.util.Arrays;

public class 문자열정렬하기2 {
    public String solution(String my_string) {
        String answer = my_string.toLowerCase();
        char[] chars = answer.toCharArray();
        Arrays.sort(chars);
        answer = new String(chars);
        return answer;
    }
}