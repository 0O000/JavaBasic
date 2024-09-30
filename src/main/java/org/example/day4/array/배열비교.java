package org.example.day4.array;

public class 배열비교 {
    public static void main(String[] args) {
        String[] title = {"국어", "영어", "수학", "과학", "사회"};
        int[] n1 = {44, 66, 77, 22, 11};
        int[] n2 = {33, 55, 77, 22, 40};
        //1. 2학기, 2학기 동일한 점수인 과목수, 동일하지 않은 점수인 과목수
        int count = 0;
        for (int i = 0; i < n1.length ; i++) {
            if(n1[i] == n2[i]){
                count++;
            }
        }
        System.out.println(count);
        count = 0;
        //2. 2학기에 성적이 오른 과목수
        for (int i = 0; i < n1.length ; i++) {
            if(n1[i] < n2[i]){
                count++;
            }
        }
        System.out.println(count);
        //3. 2학기에 성적이 오른 과목명
        for (int i = 0; i < n1.length ; i++) {
            if(n1[i] < n2[i]){
                System.out.println(title[i]);
            }
        }
    }
}