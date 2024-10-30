package org.example.day22.문자열;

import java.util.ArrayList;
import java.util.Arrays;

public class 문자열잘라서정렬하기 {
    public String[] solution(String myString) {

        String[] strArr = myString.split("x");
        ArrayList<String> list = new ArrayList<>();

        for (String str : strArr) {
            if (!str.isEmpty()) {
                list.add(str);
            }
        }

        String[] result = new String[list.size()];
        list.toArray(result);
        Arrays.sort(result);
        return result;
    }
}