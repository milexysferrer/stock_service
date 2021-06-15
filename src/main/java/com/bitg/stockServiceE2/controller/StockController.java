package com.bitg.stockServiceE2.controller;

import com.bitg.stockServiceE2.domain.StockResponse;
import com.bitg.stockServiceE2.service.StockService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockController {

    private final StockService stockService;

    public StockController(StockService stockService) {
        this.stockService = stockService;
    }

    @GetMapping(value = "/stock/{idProduct}")
    public ResponseEntity<StockResponse> getStockByProductId(@PathVariable(value = "idProduct") Long productId){
        return new ResponseEntity<>(stockService.getStockByProductId(productId), HttpStatus.OK);
    }
}
