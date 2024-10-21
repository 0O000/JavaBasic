package org.example.day15.문제;

import java.util.ArrayList;
import java.util.HashSet;

public class Q6_Cast {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list);
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            set.add(list.get(i));
        }
        System.out.println(set);
        int duplication = list.size() - set.size();
        System.out.println("중복된 값의 개수: " + duplication);
    }
}
