package org.example.day10.문제;

import java.util.Scanner;

public class Q4_main {

    public static void main(String[] args) {
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
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
                Q4.createAccount();
            }
            if (menu == 2) {
                Q4.showAllAccounts();
            }
            if (menu == 3) {
                Q4.searchAccount();
            }
            if (menu == 4) {
                Q4.deleteAccount();
            }
            if (menu == 5) {
                flag = false;
            }
        }
    }
}
