package org.example.codingTest.programmers;

public class 세로읽기 {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        char[] my = my_string.toCharArray();
        for(int i = c; i <= my_string.length(); i++){
            answer += my[i - 1];
            i += m - 1;
        }
        return answer;
    }
}