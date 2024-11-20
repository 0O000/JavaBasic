package org.example.mongo.문제;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class Q2_01 {
    public static void main(String[] args) {
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        MongoDatabase database = mongoClient.getDatabase("shop");
        MongoCollection<Document> products = database.getCollection("products");
        Document query = new Document("category", "Electronics")
                .append("price", new Document("$gte", 1000000));
        for (Document product : products.find(query)) {
            System.out.println(product.toJson());
        }
        mongoClient.close();
    }
}