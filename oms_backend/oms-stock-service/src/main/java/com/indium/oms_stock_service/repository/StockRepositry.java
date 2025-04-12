package com.indium.oms_stock_service.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.indium.oms_stock_service.Entity.Stock;

public interface StockRepositry extends JpaRepository<Stock, Integer>{

	Stock findByStockName(String order_item);
	
	

}
