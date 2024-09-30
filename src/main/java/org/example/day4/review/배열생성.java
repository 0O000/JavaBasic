package org.example.day4.review;

public class 배열생성 {
    public static void main(String[] args) {
        int[] days = {1, 3, 4, 5, 6};

        String[] doing = new String[days.length];
        doing[0] = "쉬기"; //String --> "", char --> ''
        doing[1] = "서울숲";

        double[] temp = {22.3, 24.1, 25, 26.3, 21};

        for (int i = 0; i < days.length; i++) {
            System.out.println(days[i] + " " + doing[i] + " " + temp[i]);
        }

        for (double t : temp){
            //temp라는 배열을 앞에서 부터 순서대로 있는지 체크해서 하나씩 꺼내어
            //t라는 변수에 넣어주는 for문 (for-each문)
            System.out.println(t);
        }
    }
}
