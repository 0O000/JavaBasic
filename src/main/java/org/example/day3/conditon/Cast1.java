package org.example.day3.conditon;

public class Cast1 {
    public static void main(String[] args) {
        //자동 형변환, 묵시적 형변환(작은 -> 큰)
        byte x = 100;
        int y = x;
        System.out.println(x + " " + y);

        //강제 형변황, 명시적 형변환 (큰 -> 작은)
        int x2 = 100;
        byte y2 = (byte)x2;
        System.out.println(x2 + " " + y2);
    }
}
