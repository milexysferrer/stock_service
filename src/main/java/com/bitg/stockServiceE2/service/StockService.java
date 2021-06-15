package com.bitg.stockServiceE2.service;

import com.bitg.stockServiceE2.domain.StockResponse;
import com.bitg.stockServiceE2.repository.StockRepository;
import org.springframework.stereotype.Service;

@Service
public class StockService {
    private final StockRepository stockRepository;

    public StockService(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }

    public StockResponse getStockByProductId(Long idProduct){
        return new StockResponse(stockRepository.getStockByIdProduct(idProduct));
    }
}
