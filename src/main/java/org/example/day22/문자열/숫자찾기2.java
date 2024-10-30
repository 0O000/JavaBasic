package org.example.day22.문자열;


public class 숫자찾기2 {
    public static void main(String[] args) {
        int num = 29183;
        int k = 1;
        int 몇번째 = 0; //index + 1

        String num2 = String.valueOf(num);
        char[] c = num2.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if((c[i] - '0') == k){
                몇번째 = i + 1;
            } //if
        } //for
        System.out.println(몇번째);
    }
}