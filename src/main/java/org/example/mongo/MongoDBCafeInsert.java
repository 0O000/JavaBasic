package org.example.mongo;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class MongoDBCafeInsert {
    public static void insertCafeMember() {
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        MongoDatabase database = mongoClient.getDatabase("naver");
        MongoCollection<Document> collection = database.getCollection("members");
        // 네이버카페회원정보삽입 (카페에만필요한필드만포함)
        Document cafeMember = new Document("service", "Cafe")
                .append("id", "cafeUser1")
                .append("name", "홍길동")
                .append("email", "cafeuser1@naver.com")
                .append("joinDate", "2023-01-01")
                .append("membershipLevel", "Gold");
        collection.insertOne(cafeMember);
        mongoClient.close();
        System.out.println("카페회원정보삽입완료.");
    }
}