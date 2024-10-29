package org.example.day21.알고리즘.선형;

public class 숫자찾기 {
    public int solution(int num, int k) {
        String strNum = String.valueOf(num);
        String strK = String.valueOf(k);

        int index = strNum.indexOf(strK);

        if (index == -1) {
            return -1;
        } else {
            return index + 1;
        }
    }
}