package org.example.day21.알고리즘.선형;

public class 문자열다루기기본 {
    public boolean solution(String s) {
        if(s.length() == 4 || s.length() == 6) {
            for(char ch : s.toCharArray()) {
                if(ch < '0' || ch > '9') {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
