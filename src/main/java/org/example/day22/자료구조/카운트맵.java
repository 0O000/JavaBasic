package org.example.day22.자료구조;

import java.util.HashMap;

public class 카운트맵 {
    public static void main(String[] args) {
        String[] s = {"홍", "김", "홍", "홍", "김", "최"};

        HashMap<String, Integer> count = new HashMap<>();

        for(String x: s){
            count.put(x, count.getOrDefault(x, 0) + 1);
        }

        System.out.println(count);
        System.out.println(count.get("홍"));
        System.out.println(count.get("김"));
    }
}