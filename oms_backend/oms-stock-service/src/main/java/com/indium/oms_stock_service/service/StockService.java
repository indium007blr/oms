package com.indium.oms_stock_service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.indium.oms_stock_service.Entity.Stock;
import com.indium.oms_stock_service.repository.StockRepositry;

@Service
public class StockService {

	@Autowired 
	StockRepositry repositry;
	public List<Stock> fetchAllStock() {
		
		return repositry.findAll();
	}
	public Stock fetchStock(Integer id) {
		
		return repositry.findById(id).get();
	}
	
	

}
