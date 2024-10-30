package org.example.codingTest.baekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q10828_스택 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> st = new Stack<>();

        String[] input = new String[N];
        for (int i = 0; i < N; i++) {
            input[i] = br.readLine();
        }

        for (int i = 0; i < N; i++) {
            String[] stack = input[i].split(" ");

            if (stack[0].equals("push")) {
                st.push(Integer.parseInt(stack[1]));
            } else if (stack[0].equals("pop")) {
                if (!st.isEmpty()) {
                    System.out.println(st.pop());
                } else {
                    System.out.println(-1);
                }
            } else if (stack[0].equals("top")) {
                if (st.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(st.peek());
                }
            } else if (stack[0].equals("size")) {
                System.out.println(st.size());
            } else if (stack[0].equals("empty")) {
                System.out.println(st.isEmpty() ? 1 : 0);
            }
        }

        br.close();
    }
}
