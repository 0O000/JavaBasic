package org.example.mongo.문제;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class Q2_02 {
    public static void main(String[] args) {
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        MongoDatabase database = mongoClient.getDatabase("shop");
        MongoCollection<Document> products = database.getCollection("products");
        Document query = new Document("category", "Clothing").append("brand", "Asus");
        products.deleteMany(query);
        System.out.println("삭제가 완료 되었습니다.");
    }
}
// category Clothing에 brand Asus 지우기
