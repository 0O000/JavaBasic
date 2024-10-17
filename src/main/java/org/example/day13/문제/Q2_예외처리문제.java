package org.example.day13.문제;

public class Q2_예외처리문제 {
    public static void main(String[] args) {
        try {
            String[] names = {"홍길동", "김길동"};
            System.out.println(names[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("인덱스 값을 넘어갔습니다.");
        }
        try {
            int[] age = null;
            System.out.println(age.length);
        } catch (NullPointerException e) {
            System.out.println("Null은 값이 없기에 길이도 없습니다.");
        }
    }
}
