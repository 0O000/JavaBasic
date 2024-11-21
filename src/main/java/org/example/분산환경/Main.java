package org.example.분산환경;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) throws Exception {

        MySQLService mySQLService = new MySQLService();
        MongoDBService mongoDBService = new MongoDBService();

        Connection mysqlConnection = mySQLService.connect();
        MongoClient mongoClient = mongoDBService.connect();

        MongoDatabase mongoDatabase = mongoClient.getDatabase("aws");
        int userId = mySQLService.insertUser(mysqlConnection, "hong", "hong@new.com");
        System.out.println("User ID: " + userId);

        mongoDBService.insertActivity(mongoDatabase, userId, "Login", "2024-11-10T10:15:00");
        mongoDBService.insertActivity(mongoDatabase, userId, "Order", "2024-11-11T11:15:00");
        mongoDBService.insertActivity(mongoDatabase, userId, "Order", "2024-11-21T11:15:00");

        mySQLService.fetchUserInfo(mysqlConnection, userId);

        mongoDBService.fetchUserActivity(mongoDatabase, userId);
    }
}
