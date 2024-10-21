package org.example.day15.문제;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class Q1_Cast {
    public static void main(String[] args) {

        System.out.println("=========참가자문제=========");
        // ArrayList 컬렉션 이용하기
        ArrayList list = new ArrayList();
        list.add("박소정");
        list.add("김경민");
        list.add("소지현");
        list.add("김개빈");
        System.out.println("초기 참가자 목록: " + list);
        list.remove(1);
        System.out.println("탈락 후 참가자 목록: " + list);
        for (int i = 0; i < 3; i++) {
            System.out.println(i+1 + "등: " + list.get(i));
        }

        System.out.println("=========시험문제=========");
        // Queue 컬렉션 이용하기
        Queue queue = new ArrayDeque();
        queue.add("국어");
        queue.add("수학");
        queue.add("영어");
        queue.add("컴퓨터");
        System.out.println("처음 시험별 과목: " + queue);
        for (int i = 0; i < 3; i++) {
            // 첫번째 값 삭제
            queue.poll();
            System.out.println(i+1 + "회차 " + queue);
        }
    }
}
