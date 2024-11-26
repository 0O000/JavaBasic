package org.example.mini;

import java.util.List;
import java.util.Scanner;

public class MiniUI {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        MiniDAO requestDAO = new MiniDAO();

        while (true) {
            System.out.println("======= 메뉴 =======");
            System.out.println("1. 요청 목록 보기");
            System.out.println("2. 재고 보기");
            int menu = scanner.nextInt();
            if (menu == 1) {
                System.out.println("======= 요청 목록 =======");
                List<MiniVO> pendingRequests = requestDAO.getAllPendingRequests();

                if (pendingRequests.isEmpty()) {
                    System.out.println("대기 중인 요청이 없습니다.");
                }

                for (MiniVO request : pendingRequests) {
                    System.out.println("| ID: " + request.getRequestId() + " | 상품: " + request.getRequesterId() + " | 응답자: " + request.getResponderId() +
                                    " | 상품: " + request.getProductName() + " | 개수: " + request.getQuantity() + " | 상태: " + request.getStatus() + " |");
                }

                System.out.print("처리할 요청 ID를 입력하세요 (종료: 0): ");
                int requestId = scanner.nextInt();

                if (requestId == 0) {
                    System.out.println("프로그램을 종료합니다.");
                }

                requestDAO.processRequest(requestId);
            }
            if (menu == 2) {
                List<MiniVO> checkQantity = requestDAO.getAllQuantity();
                for (MiniVO request : checkQantity) {
                    System.out.println("| ID: " + request.getUserId() + " | 이름: " + request.getProductName() +
                            " | 가격: " + request.getPrice() + " | 수량: " + request.getQuantity() + " |");
                }
            }

            if(menu == 0){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
        scanner.close();
    }
}