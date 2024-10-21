package org.example.day15.컬렉션;

import java.util.LinkedList;

public class 큐 {
    public static void main(String[] args) {
        //Queue, 큐, 대기줄
        LinkedList queue = new LinkedList();
        queue.add("어제 우유");
        queue.add("오늘 우유");
        queue.add("내일 우유");
        System.out.println(queue);
        queue.removeLast(); //맨 앞에 데이터 삭제
        System.out.println(queue);
    }
}
