package org.example.day22.문제;

public class 대문자와소문자 {
    public String solution(String my_string) {
        char[] c = my_string.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i] >= 'A' && c[i] <= 'Z') {
                c[i] += 32;
            }
            else if (c[i] >= 'a' && c[i] <= 'z') {
                c[i] -= 32;
            }
        }
        return new String(c);
    }
}