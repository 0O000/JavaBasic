package org.example.day21.알고리즘.스트링;

import java.util.ArrayList;
import java.util.Arrays;

public class 스트링문제 {
    public static void main(String[] args) {
//        1. String s = "감,배,위"; 각 글자를 추출 후(split())
//        오름차순으로 정렬하여 String에 넣어 프린트
        String s = "감, 배, 위";
        char[] c = s.toCharArray();
        Arrays.sort(c);
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]);
        }
        System.out.println();
//        2. String[] s2 = {"제주도", "부산", "울릉도"};
//        다음과 같이 출력되도록 하나의 String으로 묶어서 프린트
//        나는 제주도 가고 싶다. 나는 부산 가고 싶다. 나는 울릉도 가고 싶다.
        String[] s2 = {"제주도", "부산", "울릉도"};
        for (int i = 0; i < s2.length; i++) {
            System.out.println("나는 " + s2[i] + " 가고 싶다.");
        }
//        3. String[] s3 = {"제주도", "부산", "울릉도"};
//        s3 목록에 "울산", "파주", "인천"추가 후, 첫번째 위치에 있는 것 삭제
//        부산을 마산으로 변경후 하나의 String으로 묶어서 프린트
        String[] s3 = {"제주도", "부산", "울릉도"};
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < s3.length; i++) {
            list.add(s3[i]);
        }

        list.add("울산");
        list.add("파주");
        list.add("인천");

        list.remove(0);
        int replace = list.indexOf("부산");
        list.remove(replace);
        list.add(replace, "마산");
        StringBuilder sb = new StringBuilder(String.valueOf(list));
        System.out.println(sb.toString());

//        4. String s4 = "마사아차가나"; 오름차순으로 정렬 후 프린트
        String s4 = "마사아차가나";
        char[] c1 = s4.toCharArray();
        Arrays.sort(c1);
        System.out.println(c1);
//        5. int[] s5 = {55, 100, 77, 88, 22}를 정렬 후 역순으로 int[] s6에 옮겨 프린트
        int[] s5 = {55, 100, 77, 88, 22};
        int[] s6 = new int[s5.length];
        Arrays.sort(s5);
        for (int i = 0; i < s5.length; i++) {
            s6[i] = s5[s5.length - 1 - i];
        }
        System.out.println(Arrays.toString(s6));
    }
}
