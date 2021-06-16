package com.bitg.stockServiceE2.service;

import com.bitg.stockServiceE2.domain.Stock;
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
        Stock stock= stockRepository.getStockByIdProduct(idProduct);
        return new StockResponse(stock.getId(),stock.getIdProduct(),stock.getQuantity());
    }
}
