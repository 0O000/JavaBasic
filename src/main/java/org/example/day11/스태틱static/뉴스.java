package org.example.day11.스태틱static;

public class 뉴스 {
    String title;
    int like;
    int comment;
    String headLine;
    String reporter;
    String reporterEmail;

    private static int totalLike;
    private static int totalComment;
    private static int totalNews;

    public 뉴스(String title, int like, int comment, String headLine, String reporter, String reporterEmail) {
        this.title = title;
        this.like = like;
        this.comment = comment;
        this.headLine = headLine;
        this.reporter = reporter;
        this.reporterEmail = reporterEmail;

        totalLike += like;
        totalComment += comment;
        totalNews++;
    }

    public static int getTotalLike() {
        return totalLike;
    }

    public static int getTotalComment() {
        return totalComment;
    }

    public static int getTotalNews() {
        return totalNews;
    }

    public static int getAvgLike() {
        return totalLike / totalNews;
    }

    @Override
    public String toString() {
        return "==============뉴스==============\n" +
                "제목: '" + title + '\'' +
                "\n좋아요: " + like +
                "\n댓글수: " + comment +
                "\n기사요약: '" + headLine + '\'' +
                "\n기자: '" + reporter + '\'' +
                "\n기자이메일: '" + reporterEmail + '\'';
    }
}
