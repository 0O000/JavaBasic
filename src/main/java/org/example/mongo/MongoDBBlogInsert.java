package org.example.mongo;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class MongoDBBlogInsert {
    public static void insertBlogMember() {
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        MongoDatabase database = mongoClient.getDatabase("naver");
        MongoCollection<Document> collection = database.getCollection("members");
        // 네이버블로그회원정보삽입 (블로그에만필요한필드만포함)
        Document blogMember = new Document("service", "Blog")
                .append("id", "blogUser2")
                .append("name", "이순신")
                .append("email", "bloguser2@naver.com")
                .append("creationDate", "2022-05-10")
                .append("postCount", 120);
        collection.insertOne(blogMember);
        mongoClient.close();
        System.out.println("블로그회원정보삽입완료.");
    }
}