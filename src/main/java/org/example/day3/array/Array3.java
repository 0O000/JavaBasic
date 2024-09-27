package org.example.day3.array;

import java.util.Arrays;

public class Array3 {
    public static void main(String[] args) {

        int[] a = new int[3];
        System.out.println(a);
        a[0] = 100;
        a[1] = 200;
        a[2] = 300;
        System.out.println(Arrays.toString(a));

        int[] b = {11, 22, 33, 44, 55};
        System.out.println(b[0]);
        System.out.println(b[2]);
        System.out.println(b[4]);
        System.out.println(Arrays.toString(b));

        double[] c = {11.1, 22.2, 33.3};
        System.out.println(c[0] + c[1]);
        System.out.println(c[0] + c[c.length - 1]);
        System.out.println(c.length);
        System.out.println(Arrays.toString(c));

        String[] d = new String[4];
        d[0] = "남";
        System.out.println(d[0]);
        d[1] = "여";
        System.out.println(d[1]);
        System.out.println(d.length + " " +Arrays.toString(d));

        String[] e = new String[3];
        e[0] = "부산";
        e[1] = "제주도";
        e[2] = "전주";
        System.out.println(Arrays.toString(e));
        System.out.println("내가 첫 번째 가고싶은 곳은 " + e[0] + "이고, 마지막 가고 싶은 곳은 " + e[1] + "이다.");
    }
}
