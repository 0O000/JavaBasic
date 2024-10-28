package org.example.codingTest.programmers;

public class n의정수 {
    public static void main(String[] args) {
        int num = 98;
        int n = 2;
        Solution2 solution = new Solution2();
        System.out.println(solution.solution(num, n));
    }
}

class Solution2 {
    public int solution(int num, int n) {
        int answer = 0;
        if(num % n == 0){
            answer = 1;
        }
        return answer;
    }
}