package org.example.jdbc4.문제.Q1_JDBC;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.poi.hpsf.Decimal;

import java.math.BigDecimal;

@Getter
@Setter
@ToString
public class Q1_VO {
    private int ProductId;
    private String ProductName;
    private BigDecimal Price;
    private int Quantity;
}