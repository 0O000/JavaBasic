package org.example.mongo;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

public class Member여러개검색 {
    public static void main(String[] args) {
        //1. MongoClient 생성
        MongoClient client = new MongoClient("localhost", 27017);
        //2. db연결, collection연결
        MongoDatabase db = client.getDatabase("shop");
        MongoCollection<Document> member = db.getCollection("member");
        System.out.println("member연결 성공!");
        //3. 전송할 js생성
        //search할 json(조건)을 생성

        //4. 전송, 결과처리
        FindIterable<Document> result = member.find();
        for(Document doc : result) {
            System.out.println(doc.getString("id"));
            System.out.println(doc.getString("pw"));
            System.out.println(doc.getString("name"));
            System.out.println(doc.getString("tel"));
        }

        System.out.println("=============0=============");
        List<Document> result2 = member.find().into(new ArrayList<>());

        for(Document doc : result2) {
            System.out.println(doc.getString("id"));
            System.out.println(doc.getString("pw"));
            System.out.println(doc.getString("name"));
            System.out.println(doc.getString("tel"));
            System.out.println("=============");
        }

        System.out.println(result2.get(0));
        client.close();
    }
}
