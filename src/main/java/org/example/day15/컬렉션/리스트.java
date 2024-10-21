package org.example.day15.컬렉션;

import java.util.ArrayList;

public class 리스트 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("홍길동");
        list.add(100);
        list.add(11.2);
        list.add(true);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(0));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        for(Object o : list){
            System.out.println(o);
        }
        list.add(0, "김길동");
        System.out.println(list);

        list.remove(0);
        System.out.println(list);

        list.set(0, "정길동");
        System.out.println(list);

        System.out.println(list.indexOf(true));
        System.out.println(list.contains(11.2));
        System.out.println(list.isEmpty());
        list.clear();
        System.out.println(list);
        System.out.println(list.isEmpty());
    }
}
