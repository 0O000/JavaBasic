package org.example.day15.문제;

import java.util.HashMap;

public class Q2_Cast {
    public static void main(String[] args) {
        // HashMap 컬렉션 이용하기
        HashMap map = new HashMap();
        map.put(100, "김데이");
        map.put(200, "김사전");
        map.put(300, "김구조");
        map.put(400, "김자료");
        map.remove(200);
        map.put(300, "김충성");
        for (Object key : map.keySet()) {
            System.out.println("고객번호: " + key + ", 이름: " + map.get(key));
        }
    }
}
