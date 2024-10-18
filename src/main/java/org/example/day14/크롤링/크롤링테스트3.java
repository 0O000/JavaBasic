package org.example.day14.크롤링;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 크롤링테스트3 {
    public static void main(String[] args) throws Exception {

        String[] names = {"카카오", "네이버", "삼성전자"};
        String[] codes = {"035720", "035420", "005380"};

        for (int i = 0; i < names.length; i++) {

            Document doc = Jsoup.connect("https://finance.naver.com/item/main.naver?code=" + codes[i]).get(); // return Document

            Elements list = doc.select("span.code");
            String code = list.get(0).text();

            Elements list5 = doc.select("span.blind");
            String high = list5.get(18).text();
            String today = list5.get(14).text();
            String yesterday = list5.get(17).text();

            System.out.println("=========" + names[i] + "=========");
            System.out.println("코드: " + code);
            System.out.println("고가: " + today);
            System.out.println("현재가: " + high);
            System.out.println("전일가: " + yesterday);
        }
    }
}