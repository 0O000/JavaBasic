package org.example.day14.크롤링;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 크롤링테스트2 {
    public static void main(String[] args) throws Exception {
        // Connection: 연결통로를 나타냄
        Document doc = Jsoup.connect("https://finance.naver.com/item/main.naver?code=005930").get(); // return Document

        Elements list = doc.select("span.code");
        String code = list.get(0).text();
        System.out.println(list.size());
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).text());
        }

        Elements list2 = doc.select("span.tx");
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i).text());
        }

        Elements list3 = doc.select("div.today span.blind");
        for (int i = 0; i < list3.size(); i++) {
            System.out.println(list3.get(i).text());
        }

        Elements list4 = doc.select("td.first");
        for (int i = 0; i < list4.size(); i++) {
            System.out.println(list4.get(i).text());
        }

        Elements list5 = doc.select("span.blind");
        for (int i = 0; i < list5.size(); i++) {
            System.out.println(i + ":  " + list5.get(i).text());
        }
        //고가 high에 넣기
        String high = list5.get(18).text();
        //현재가 today에 넣기
        String today = list5.get(14).text();
        //전일 yesterday에 넣기
        String yesterday = list5.get(17).text();
        //다음과 같이 프린트해보자.
        //회사명 : 삼성전자
        System.out.println("회사명 : " + "삼성전자") ;
        //코드 :
        System.out.println("코드 : " + code);
        //고가 :
        System.out.println("고가 : " + today);
        //현재가 :
        System.out.println("현재가 : " + high);
        //전일가 :
        System.out.println("전일가 : " + yesterday);
    }
}