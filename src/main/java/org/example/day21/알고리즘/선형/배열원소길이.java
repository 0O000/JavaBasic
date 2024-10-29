package org.example.day21.알고리즘.선형;

public class 배열원소길이 {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        for(int i = 0; i < strlist.length; i++) {
            answer[i] = strlist[i].length();
        }
        return answer;
    }
}