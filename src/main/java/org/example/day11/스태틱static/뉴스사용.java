package org.example.day11.스태틱static;

public class 뉴스사용 {
    public static void main(String[] args) {
        뉴스 news1 = new 뉴스("\"한강, 노벨상 상금 전액 독도에 기부\" 가짜뉴스 등장", 17, 118
                , "소설가 한강의 노벨문학상 수상 직후 페이스북 등 SNS에서 유통된 가짜뉴스. 한강이 노벨상 상금 전액을 독도 평화를 위해 기부하겠다는 내용으로, 사실무근이다. "
                , "장재진", "blanc@hankookilbo.com");
        뉴스 news2 = new 뉴스("[속보] 합참 \"북한, 경의선·동해선 연결도로 폭파\"", 1, 12
                ,"15일 북한이 경의선과 동해선 도로를 폭파했다. 전날 경기 파주시 접경지역에서 바라본 서부전선 비무장지대(DMZ) 북측 지역의 경의선 도로 위 구조물 인근에 흙더미(붉은원)가 쌓여 있다."
                ,"김경준", "ultrakj75@hankookilbo.com"
                );

        System.out.println(news1);
        System.out.println(news2);

        System.out.println("=============뉴스분석=============");
        System.out.println("총 뉴스 수: " + 뉴스.getTotalNews() + "\n총 좋아요 수: " + 뉴스.getTotalLike() + "\n총 댓글 수: " + 뉴스.getTotalComment());
    }
}
