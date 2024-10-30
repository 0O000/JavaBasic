package org.example.day22.문자열;

public class 숫자찾기 {
    public static void main(String[] args) {
        char c = '1';
        char c2 ='2';
        System.out.println(c + c2); //99
        //int로 변경후 더해야함.
        int ic = c - '0'; //49 - 48 = 1
        int ic2 = c2 - '0'; //50 - 48 = 2
        System.out.println(ic + ic2);

        String s = "1234";

        char[] chars = s.toCharArray();
        int sum = 0;
        for (int i = 0; i < chars.length; i++) {
            sum += chars[i] - '0';
        }
        System.out.println(sum);
    }
}