package org.example.codingTest.programmers;

public class 정수찾기 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] num_list = {1, 2, 3, 4, 5};
        int n = 3;

        System.out.println(s.solution(num_list, n));
    }
}

class Solution {
    public int solution(int[] num_list, int n) {
        int answer = 0;
        for(int i = 0; i < num_list.length; i++){
            if(num_list[i] == n){
                answer = 1;
                break;
            }
        }
        return answer;
    }
}