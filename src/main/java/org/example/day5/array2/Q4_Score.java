package org.example.day5.array2;

import java.util.Arrays;

public class Q4_Score {
    public static void main(String[] args) {

        String[] sub = {"국어", "영어", "수학", "컴퓨터", "회화"};
        int[] term1 = {44, 66, 22, 99, 100};
        int[] term2 = {55, 66, 88, 99, 100};
        int same = 0;
        int up = 0;
        StringBuffer upSub = new StringBuffer();

        System.out.println(Arrays.toString(term1));
        System.out.println(Arrays.toString(term2));

        for(int i = 0; i < term1.length; i++){
            if(term1[i] == term2[i]){
                same++;
            }
            if(term1[i] < term2[i]){
                up++;
                upSub.append(sub[i] + " ");
            }
        }
        System.out.println("1학기 2학기 동일한 성적 과목수: " + same);
        System.out.println("성적이 오른 과목수: " + up);
        System.out.println("성적이 오른 과목명: " + upSub);
    }
}