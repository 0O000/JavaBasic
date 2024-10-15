package org.example.day10.문제;

import java.util.Scanner;

public class Q4 {
    private static Q4[] accounts = new Q4[3];  // 최대 3개의 계좌만 관리
    private static int count = 0;
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

    static void createAccount() {

        if (count > accounts.length - 1) {
            System.out.println("더이상 계좌를 생성할 수 없습니다.");
            return;
        }

        System.out.print("새 계좌를 입력하세요: ");
        String[] newAccount = sc.nextLine().split(" ");
        accounts[count] = new Q4(newAccount[0], newAccount[1], Integer.parseInt(newAccount[2]));
        count++;
        System.out.println("계좌가 생성되었습니다.");
    };

    public static void showAllAccounts() {
        if (count == 0) {
            System.out.println("저장된 계좌가 없습니다.");
            return;
        }

        System.out.println("저장된 모든 계좌 정보를 출력합니다.");
        for (Q4 account : accounts) {
            if (account != null) {
                System.out.println(account);
            }
        }
    }

    public static void searchAccount() {
        System.out.print("검색할 계좌번호를 입력하세요: ");
        String searchAccountNumber = sc.next();
        System.out.println(searchAccountNumber);
        for (Q4 account : accounts) {
            if (account == null) {
                System.out.println("계좌를 찾을 수 없습니다.");
                break;
            }
            if (account.myAccount.equals(searchAccountNumber)) {
                System.out.println(account);
                break;
            }
        }
    }

    public static void deleteAccount() {
        System.out.print("삭제할 계좌번호를 입력하세요: ");
        String deleteAccountNumber = sc.next();
        for (Q4 account : accounts) {
            if (account == null) {
                System.out.println("계좌를 찾을 수 없습니다.");
                break;
            }
            if (account.myAccount.equals(deleteAccountNumber)) {
                accounts[count - 1] = null;  // 마지막 계좌를 null로 처리
                count--;
                System.out.println("계좌가 삭제되었습니다.");
                break;
            }
            System.out.println("계좌를 찾을 수 없습니다.");
        }
    }
}
