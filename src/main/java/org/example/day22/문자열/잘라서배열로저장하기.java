package org.example.day22.문자열;

import java.util.ArrayList;

public class 잘라서배열로저장하기 {
    public String[] solution(String my_str, int n) {

        ArrayList<String> list = new ArrayList<>();
        int range = my_str.length() / n;
        System.out.println(range);
        for (int i = 0; i < range; i++) {
            System.out.println(my_str.substring(i, i + n));
            list.add(my_str.substring(i, i + n));
            i += n;
        }
        String[] answer = new String[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}