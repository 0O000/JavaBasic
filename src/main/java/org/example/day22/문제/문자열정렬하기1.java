package org.example.day22.문제;

import java.util.Arrays;

public class 문자열정렬하기1 {
    public int[] solution(String my_string) {
        String ans = "";
        char[] c = my_string.toCharArray();
        for (int i = 0; i < my_string.length(); i++) {
            if (c[i] >= '0' && c[i] <= '9') {
                ans += c[i];
            }
        }
        int[] answer = new int[ans.length()];
        for (int i = 0; i < ans.length(); i++) {
            answer[i] = ans.charAt(i) - '0';
        }
        Arrays.sort(answer);
        return answer;
    }
}