package org.example.day21.알고리즘.선형;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 배열을컬렉션으로 {
    public static void main(String[] args) {
        String[] s = {"a", "b", "c"};
        //배열을 리스트로 변경하는 방법
        //1. 리스트만들어서 배열--> 리스트로 옮긴다.
        List<String> list1 = new ArrayList<>();
        for (String x: s){
            list1.add(x);
        }
        System.out.println(list1);

        //2. 배열을 바로 list로 만든다. asList()
        List<String> list2 = Arrays.asList(s);
        System.out.println(list2);
        //list2.add("추가");
        //list2.remove(0);
        //--> 길이 조정 불가능!
        list2.set(0, "바꾸는 스트링");
        //--> 값은 변경 가능!
        System.out.println(list2);
        //1번.
        int[] x = {1, 2, 3, 4, 5};
        ArrayList<Integer> list3 = new ArrayList<>();
        for (int i = 0; i < x.length; i++) {
            list3.add(x[i] * 10);
        }
        Collections.reverse(list3);
        System.out.println(list3);
        //2번.
        list3.add(6);
        list3.add(7);
        System.out.println(list3);
    }
}