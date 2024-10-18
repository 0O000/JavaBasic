package org.example.day14.크롤링;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 크롤링테스트1 {
    public static void main(String[] args) throws Exception {
        // String s = JOptionPane.showInputDialog("날씨 입력"); // return String
        Connection con = Jsoup.connect("https://www.naver.com"); // return Connection
        // Connection: 연결통로를 나타냄
        Document doc = con.get(); // return Document
        // Document(소스코드)
        // Document doc2 = Jsoup.connect("https://www.naver.com").get();
        System.out.println("================설치성공================");

        Elements list = doc.select("span.blind");
        System.out.println(list.size());
        System.out.println(list);

        Element e1 = list.get(0);
        String e1Text = e1.text();
        System.out.println(e1Text);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).text());
        }
    }
}
