package org.example.day10.문제;

import java.util.Scanner;

public class Q4 {
    static Scanner sc = new Scanner(System.in);
    String myAccount;
    String myName;
    int myProperty;

    public Q4(String myAccount, String myName, int myProperty) {
        this.myAccount = myAccount;
        this.myName = myName;
        this.myProperty = myProperty;
    }

    @Override
    public String toString() {
        return "계좌번호: " + myAccount + ", 소유자: " + myName + ", 잔액: " + myProperty;
    }
}
