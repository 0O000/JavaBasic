package org.example.jdbc2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class BoardVO {
    private int no;
    private String title;
    private String content;
    private String wirter;
}
