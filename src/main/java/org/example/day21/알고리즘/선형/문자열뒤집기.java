package org.example.day21.알고리즘.선형;

public class 문자열뒤집기 {
    public String solution(String my_string) {
        String answer = "";
        for(int i = 0; i < my_string.length(); i++){
            answer +=  my_string.charAt(my_string.length() - i - 1);
        }
        return answer;
    }
}