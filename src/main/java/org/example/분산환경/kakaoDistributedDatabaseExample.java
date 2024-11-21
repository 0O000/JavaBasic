package org.example.분산환경;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.sql.*;
import java.util.ArrayList;

public class kakaoDistributedDatabaseExample {
    // MySQL JDBC URL
    private static final String MYSQL_URL = "jdbc:mysql://localhost:3306/kakao";
    private static final String MYSQL_USER = "root";
    private static final String MYSQL_PASSWORD = "1234";
    // MongoDB Connection URI
    // private static final String MONGO_URI = "mongodb://localhost:27017";
    public static void main(String[] args) {
        try {
            //1단계 mySql연결
            Class.forName("com.mysql.jdbc.Driver");
            Connection mysqlConnection = DriverManager.getConnection(MYSQL_URL, MYSQL_USER, MYSQL_PASSWORD);
            System.out.println("1. MySQL 연결 완료!");
            //2단계 회원가입 후 auto_Increment 증가한 id를 얻어오기.
            String insertUserSQL = "INSERT INTO users (name, email) VALUES (?, ?)";
            PreparedStatement pstmt = mysqlConnection.prepareStatement(insertUserSQL, Statement.RETURN_GENERATED_KEYS);
            pstmt.setString(1, "John Doe");
            pstmt.setString(2, "john.doe@example.com");
            pstmt.executeUpdate();
            System.out.println("2. SQL전송");
            //3단계 2단계에서 얻은 id를 이용해서 몽고DB에 중요 정보를 넣자.
            ResultSet rs = pstmt.getGeneratedKeys();
            int userId = 0;
            if (rs.next()) {
                userId = rs.getInt(1);
            }
            System.out.println("자동생성된 userId: " + userId);
            //3-1. mongoDB연결
            MongoClient client = new MongoClient("localhost", 27017);
            MongoDatabase mongoDatabase = client.getDatabase("kakao_logs");
            MongoCollection<Document> logCollection = mongoDatabase.getCollection("activity_logs");
            System.out.println("3. MongoDB 연결.");
            //3-2. document를 만들어서 전송
            Document activityLog = new Document();
            activityLog.append("userId", userId);
            activityLog.append("activity", "Login");
            activityLog.append("timestamp", "2024-11-20");

            Document activityLog2 = new Document();
            activityLog2.append("userId", userId);
            activityLog2.append("activity", "Shopping");
            activityLog2.append("timestamp", "2024-11-21");

            logCollection.insertOne(activityLog);
            logCollection.insertOne(activityLog2);
            System.out.println("Inserted order for user ID: " + userId);
            //4단계 회원정보는 mySql검색, 회원주문정보보기는 mongodb검색하여 분산!
            //4-1. 회원정보는 mySql검색
            String selectUserSQL = "SELECT * FROM users WHERE id = ?";
            PreparedStatement selectPstmt = mysqlConnection.prepareStatement(selectUserSQL);
            selectPstmt.setInt(1, userId);
            ResultSet userResult = selectPstmt.executeQuery();
            if (userResult.next()) {
                System.out.println("User Info: ");
                System.out.println("ID: " + userResult.getInt("id"));
                System.out.println("Name: " + userResult.getString("name"));
                System.out.println("Email: " + userResult.getString("email"));
            }
            //4-2. 회원주문정보보기는 mongodb검색
            //필터 JSON(Document)
            Document filter = new Document("userId", userId);
            ArrayList<Document> result = logCollection.find(filter).into(new ArrayList<Document>());
            if(result != null){
                System.out.println("몽고DB 검색결과: " + result);
            }
            mysqlConnection.close();
            client.close();
        } catch (Exception e) {
            System.out.println(e.getCause());
        }
    }
}
