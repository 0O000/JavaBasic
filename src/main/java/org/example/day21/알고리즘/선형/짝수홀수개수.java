package org.example.day21.알고리즘.선형;

public class 짝수홀수개수 {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        for(int i = 0; i < num_list.length; i++) {
            if(num_list[i] % 2 == 0){
                answer[0]++;
            }
            else{
                answer[1]++;
            }
        }
        return answer;
    }
}