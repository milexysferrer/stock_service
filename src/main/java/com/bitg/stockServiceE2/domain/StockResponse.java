package com.bitg.stockServiceE2.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StockResponse {
    private Long id;
    private Long idProduct;
    private int quantity;
}
