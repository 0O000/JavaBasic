package org.example.day15.컬렉션;

import org.apache.commons.compress.utils.Sets;

import java.util.*;

public class 컬렉션확인문제 {
    public static void main(String[] args) {
        //set 사용 (중복X)
        HashSet set = new HashSet();
        set.add("서울");
        set.add("부산");
        set.add("서울");
        set.add("미국");
        set.add("스페인");
        set.add("일본");
        set.add("미국");
        for(Object s : set){
            System.out.println(s);
        }
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        //key 사용 (키, 값)
        HashMap map = new HashMap();
        map.put("안방", "TV");
        map.put("거실", "쇼파");
        map.put("부엌", "냉장고");
        map.put("현관", "신발");
        System.out.println(map);
        System.out.println("현관에는 무엇이 있나요? " + map.get("현관"));
        System.out.println("거실에는 무엇이 있나요? " + map.get("거실"));
        //Array 사용 (set으로 변경)
        ArrayList list = new ArrayList();
        list.add("공부");
        list.add("운동");
        list.add("놀기");
        list.add("잠자기");
        list.add("밥먹기");
        System.out.println(list);
        list.set(1, "청소");
        System.out.println(list);
        for(Object s : list){
            System.out.println(s);
        }
        Iterator it2 = list.iterator();
        while(it2.hasNext()){
            System.out.println(it2.next());
        }
    }
}
