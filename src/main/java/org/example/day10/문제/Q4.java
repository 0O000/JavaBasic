package org.example.day10.문제;

public class Q4 {

    String myAccount;
    String myName;
    int myProperty;

    public Q4(String myAccount, String myName, int myProperty) {
        this.myAccount = myAccount;
        this.myName = myName;
        this.myProperty = myProperty;
    }

    public String getMyAccount() {
        return myAccount;
    }

    public String getMyName() {
        return myName;
    }

    public int getMyProperty() {
        return myProperty;
    }

    @Override
    public String toString() {
        return "계좌번호: " + myAccount + ", 소유자: " + myName + ", 잔액: " + myProperty;
    }
}
