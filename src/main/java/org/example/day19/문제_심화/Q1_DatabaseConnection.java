package org.example.day19.문제_심화;

public class Q1_DatabaseConnection {
    private static Q1_DatabaseConnection databaseConnection;

    private Q1_DatabaseConnection(){
        System.out.println("데이터베이스 연결 객체가 생성되었습니다.");
    }

    public static Q1_DatabaseConnection getInstance(){
        if(databaseConnection == null){
            databaseConnection = new Q1_DatabaseConnection();
        }
        return databaseConnection;
    }
}
