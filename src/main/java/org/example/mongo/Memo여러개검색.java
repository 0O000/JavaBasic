package org.example.mongo;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class Memo여러개검색 {
    public static void main(String[] args) {
        //1. MongoClient 생성
        MongoClient client = new MongoClient("localhost", 27017);
        //2. db연결, collection연결
        MongoDatabase db = client.getDatabase("shop");
        MongoCollection<Document> memo = db.getCollection("memo");
        System.out.println("memo연결 성공!");
        //3. 전송할 js생성
        //search할 json(조건)을 생성
        Document filter = new Document();
        filter.append("age", 3);
        //4. 전송, 결과처리
        FindIterable<Document> result = memo.find(filter);
        for(Document doc : result) {
            System.out.println(doc.getString("name"));
            System.out.println(doc.getInteger("age"));
            System.out.println(doc.getString("office"));
            System.out.println(doc.getString("phone"));
        }
        client.close();
    }
}
