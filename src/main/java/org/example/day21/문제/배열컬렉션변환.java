package org.example.day21.문제;

import java.util.ArrayList;
import java.util.Arrays;

public class 배열컬렉션변환 {
    public static void main(String[] args) {
        String[] s3 = {"박명수", "유재석","김종국","송지효","하하"};
        String[] s4 = new String[s3.length];
        ArrayList<String> list = new ArrayList<>();
        Arrays.sort(s3);
        System.out.println(Arrays.toString(s3));

        for (int i = 0; i < s3.length; i++) {
            s4[i] = s3[s3.length - 1 - i];
        }
        System.out.println(Arrays.toString(s4));

        for(String name : s4){
            if(name.length() > 2){
                list.add(name);
            }
        }
        System.out.println(list);

        int index = list.indexOf("유재석");
        list.remove(index);
        list.add(index, "유재돌");
        System.out.println(list);

        list.add(2, "김종민");
        System.out.println(list);
    }
}
