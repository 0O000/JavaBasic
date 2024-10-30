package org.example.day22.자료구조;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;
import java.util.TreeSet;

public class 문제Main {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

//        1. 스택을 이용해서 푸세요.
        String[] s = {"밥", "커피", "밥", "커피", "밥", "밥"};
        boolean answer = false;
//        식사(밥)먹은 후에 커피를 마셨으면  true, 아니면 false
        for (int i = 0; i < s.length; i++) {
            if (s[i].equals("밥")) {
                stack.push(s[i]);
                if (stack.peek().equals("밥")) {
                    stack.pop();
                    System.out.println("false");
                }
            }
            if (s[i].equals("커피")) {
                if (stack.isEmpty()) {
                    System.out.println("false");
                }
                if (!stack.isEmpty()) {
                    if (stack.peek().equals("밥")) {
                        stack.pop();
                        System.out.println("true");
                    }
                    if (stack.peek().equals("커피")) {
                        stack.pop();
                        System.out.println("false");
                    }
                }
            }
        }
        System.out.println(answer);
//        2. HashMap을 이용해서 푸세요.
//        밥과 커피먹은 횟수 구하여 출력
//        밥을 더 많이 먹었으면 "밥을 더 먹었군요"
//        커피를 더 많이 마셨으면 "커피를 더 마셨군요"
        String[] s2 = {"밥", "커피", "밥", "커피", "밥", "밥"};
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < s.length; i++) {
            hashMap.put(s[i], i);
        }
        System.out.println(hashMap);
        if (hashMap.get("커피") > hashMap.get("밥")) {
            System.out.println("커피를 더 마셨군요");
        } else {
            System.out.println("밥을 더 먹었군요");
        }
//        3. TreeSet을 이용해서 푸세요.
//        int[] s3 = {11, 3, 78, 9, 2, 2, 100, 3}을 중복을 제거후 오름차순으로
//        정렬 후 가장 큰 값과 가장 작은 값을 출력하세요.
        int[] s3 = {11, 3, 78, 9, 2, 2, 100, 3};
        TreeSet tree = new TreeSet();
        for (int i = 0; i < s3.length; i++) {
            tree.add(s3[i]);
        }
        System.out.println(tree);
        System.out.println(tree.first() + " " + tree.last());
//        4. int[] s4 = {11, 3, 78, 9, 2, 100} 오름차순 정렬 후
        int[] s4 = {11, 3, 78, 9, 2, 100};
//        2번째 큰 값과 2번째 작은 값을 구하세요.
        Arrays.sort(s4);
        System.out.println(Arrays.toString(s4));
        System.out.println(s4[1] + " " + s4[s4.length - 2]);
//        5. String s5 = "감고나무감나무신세계신"; 각 글자가 몇 번 나왔는지 프린트
//        (HashMap을 이용해서 푸세요.)
        String s5 = "감고나무감나무신세계신";
        HashMap<String, Integer> hs = new HashMap<>();
        char[] c = s5.toCharArray();
        for (int i = 0; i < s5.length(); i++) {
            hs.put(c[i] + "", i);
        }
        System.out.println(hs);

//        6. int[] s6 = {11, 3, 78, 9, 2, 2, 100, 3};
//        int[] s7 = new int[s6.length];
//        s6의 원소들을 s7으로 역순으로 옮겨 프린트
        int[] s6 = {11, 3, 78, 9, 2, 2, 100, 3};
        int[] s7 = new int[s6.length];
        for (int i = 0; i < s6.length; i++) {
            s7[i] = s6[s6.length - 1 - i];
        }
        System.out.println(Arrays.toString(s7));

//        7. int s7 = 2345123456897;에서 중복된 수를 제외하고 각 자리수를 더하시오.
//        8. int[] s5 = {11, 3, 78, 9, 2, 2, 100, 3};를 Stack<Integer>로 옮겨
//        인덱스 0, 3, 5위치의 값을 각각 더한 후, top에서 3개를 pop하여
//        stack에 들어있는 목록을 프린트

//        9. 268페이지 확인문제 - String에서 char[]로 옮기기

//        10. int[] s8 = {1,2,3}; int[] s9 = {1,2,3};이 같은지/다른지 비교하여 프린트
    }
}