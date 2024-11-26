package org.example.mini;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter

public class MiniVO {
    private String userId;
    private BigDecimal price;
    private int requestId;
    private String requesterId;
    private String responderId;
    private String productName;
    private int quantity;
    private String status;
}