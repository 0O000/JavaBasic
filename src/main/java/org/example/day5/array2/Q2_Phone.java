package org.example.day5.array2;

import java.util.Scanner;

public class Q2_Phone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("전화번호입력>> ");
        String phone = sc.nextLine();
        phone = phone.trim();
        String[] phoneNum = phone.split("-");
        String firstNum = phoneNum[0];
        String company = "";
        if(firstNum.equals("011")){
            company = "SK";
        }if (firstNum.equals("019")) {
            company = "LG";
        }else{
            company = "Apple";
        }
        System.out.println(company);
        String secondNum = phoneNum[1];
        if(secondNum.length() > 3){
            System.out.println("최신폰");
        }else{
            System.out.println("올드폰");
        }
        int phoneLength = phoneNum[0].length() + phoneNum[1].length() + phoneNum[2].length();
        if(phoneLength > 9){
            System.out.println("유효한 전화번호");
        }else{
            System.out.println("유효하지 않은 전화번호");
        }
    }
}
