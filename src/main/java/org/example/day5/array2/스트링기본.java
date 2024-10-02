package org.example.day5.array2;

public class 스트링기본 {
    public static void main(String[] args) {
        String s1 = "나는 프로그래머";
        String s2 = "진짜!!!!";
        System.out.println(s1 + s2);
        System.out.println(s1.concat(s2));
        System.out.println(s1.charAt(0));
        System.out.println(s2.charAt(0));
        System.out.println(s1.endsWith("는"));
        System.out.println(s1.contains("는"));
    }
}
