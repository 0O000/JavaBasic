package org.example.분산환경;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class MongoDBService {
    private static final String MONGO_HOST = "localhost";
    private static final int MONGO_PORT = 27017;
    private static final String COLLECTION_NAME = "activity_logs";

    public MongoClient connect() {
        return new MongoClient(MONGO_HOST, MONGO_PORT);
    }

    public void insertActivity(MongoDatabase database, int userId, String activity, String timestamp) {
        MongoCollection<Document> collection = database.getCollection(COLLECTION_NAME);
        Document document = new Document("user_id", userId)
                .append("activity", activity)
                .append("timestamp", timestamp);
        collection.insertOne(document);
    }

    public void fetchUserActivity(MongoDatabase database, int userId) {
        MongoCollection<Document> collection = database.getCollection(COLLECTION_NAME);
        Document filter = new Document("user_id", userId);
        System.out.println("MongoDB Activity:");
        for (Document doc : collection.find(filter)) {
            System.out.println(doc.toJson());
        }
    }
}