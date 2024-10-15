package org.example.day10.문제;

import java.util.Scanner;

public class Q4_main {
    private static Q4[] accounts = new Q4[3];  // 최대 3개의 계좌만 관리
    private static int count = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {
            System.out.println("은행 계좌 관리 애플리케이션");
            System.out.println("1. 계좌생성");
            System.out.println("2. 계좌 정보 보기");
            System.out.println("3. 계좌 정보 검색");
            System.out.println("4. 계좌 삭제");
            System.out.println("5. 프로그램 종료");
            System.out.print("메뉴를 선택하세요: ");
            int menu = sc.nextInt();
            sc.nextLine();
            if (menu == 1) {
                createAccount();
            }
            if (menu == 2) {
                showAllAccounts();
            }
            if (menu == 3) {
                searchAccount();
            }
            if (menu == 4) {
                deleteAccount();
            }
            if (menu == 5) {
                flag = false;
            }
        }
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
