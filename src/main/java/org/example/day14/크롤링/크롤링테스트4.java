package org.example.day14.크롤링;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 크롤링테스트4 {
    public static void main(String[] args) throws Exception{
        Document doc = Jsoup.connect("https://news.naver.com/").get();
        Elements list = doc.select(".Nitem_link");
        System.out.println(list.size());
        for(int i = 0; i < list.size(); i++){
            Element tag = list.get(i);
            System.out.println(i + ": " + tag.text());
        }
    }
}
