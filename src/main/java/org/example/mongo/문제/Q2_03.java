package org.example.mongo.문제;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class Q2_03 {
    public static void main(String[] args) {
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        MongoDatabase database = mongoClient.getDatabase("shop");
        MongoCollection<Document> products = database.getCollection("products");
        Document query = new Document("category", "Books")
                .append("price", new Document("$gte", 1900000));
        for (Document product : products.find(query)) {
            System.out.println(product.toJson());
        }
        System.out.println("삭제가 완료 되었습니다.");
        products.deleteMany(query);
        mongoClient.close();
    }
}
// category books에 price 1900000이상 지우기