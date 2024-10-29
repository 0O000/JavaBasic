package org.example.day21.알고리즘.선형;

import java.util.ArrayList;

public class n의배수고르기 {
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < numlist.length; i++) {
            if(numlist[i] % n == 0) {
                list.add(numlist[i]);
            }
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}