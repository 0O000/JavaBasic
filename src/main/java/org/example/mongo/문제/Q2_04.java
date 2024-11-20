package org.example.mongo.문제;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class Q2_04 {
    public static void main(String[] args) {
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        MongoDatabase database = mongoClient.getDatabase("shop");
        MongoCollection<Document> products = database.getCollection("products");
        Document query = new Document("category", "Electronics")
                .append("name", new Document("$regex", "Smart"));
        for (Document product : products.find(query)) {
            System.out.println(product.toJson());
        }
        mongoClient.close();
    }
}