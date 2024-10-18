package org.example.day14.크롤링;

import java.util.ArrayList;
import java.util.Arrays;

public class 리스트테스트 {
    public static void main(String[] args) {
        // 고정, 여러개 -> 배열
        // 가변, 여러개 -> ArrayList
        // Elements(자식) -> ArrayList(부모)

        ArrayList list = new ArrayList();

        list.add("검색");
        list.add("메일");
        list.add("카페");

        System.out.println(list);

        System.out.println(list.size());

        System.out.println(list.get(0));

        list.remove(2);

        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for(Object x : list){
            System.out.println(x);
        }
    }
}
