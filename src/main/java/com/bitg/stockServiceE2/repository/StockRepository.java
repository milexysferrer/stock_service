package com.bitg.stockServiceE2.repository;

import com.bitg.stockServiceE2.domain.Stock;
import com.bitg.stockServiceE2.domain.StockResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepository extends JpaRepository<Stock, Long> {

    @Query("SELECT s FROM Stock s WHERE s.idProduct= ?1")
    Stock getStockByIdProduct(Long idProduct);
}
