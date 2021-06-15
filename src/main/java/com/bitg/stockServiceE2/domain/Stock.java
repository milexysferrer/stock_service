package com.bitg.stockServiceE2.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "stock")
public class Stock {
    @Id
    private Long id;
    private Long idProduct;
    private int quantity;
}
