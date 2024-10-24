package org.example.day18.문제_심화;

public class Q2_Main {
    public static void main(String[] args) {
        Q2_Girl girl = new Q2_Girl();
        girl.action(name -> System.out.println(name + "할 때는 white드레스를 입는다."));
        girl.action2((name, price, count) -> System.out.println("나는 매일 " + name + " 후 " + price + "원짜리 음료" + count + "개를 " +
                count * price + "원을 주고 사먹는다."
                ));
    }
}
