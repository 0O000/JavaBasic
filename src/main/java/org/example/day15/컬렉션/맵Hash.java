package org.example.day15.컬렉션;

import java.util.HashMap;

public class 맵Hash {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("name", "홍길동");
        map.put("age", 18);
        map.put("gender", 'M');
        map.put("weight", 70);
        map.put("height", 180);
        System.out.println(map);
        String name2 = (String)map.get("name");
        System.out.println(name2.substring(0, 1));

        map.put("age", 20);
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.isEmpty());

        map.remove("gender");
        System.out.println(map);
        System.out.println(map.containsKey("weight"));
        System.out.println(map.containsValue("홍길동"));
        System.out.println(map.keySet());
        System.out.println(map.values());
    }
}
