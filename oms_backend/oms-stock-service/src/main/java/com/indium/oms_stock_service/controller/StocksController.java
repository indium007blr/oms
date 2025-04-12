package com.indium.oms_stock_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.indium.oms_stock_service.Entity.Stock;
import com.indium.oms_stock_service.service.StockService;

@RestController
@RequestMapping("/api/v1/oms")
public class StocksController {

	@Autowired
	StockService stockService;

	// Get all stocks details list

	@GetMapping("/stocks")
	ResponseEntity<List<Stock>> fetchAllStock()

	{
		List<Stock> stocks = stockService.fetchAllStock();
		return ResponseEntity.ok(stocks);
	}

	@GetMapping("/stock/{id}")
	ResponseEntity<Stock> fetchStock(@PathVariable Integer id)

	{
		Stock stock = stockService.fetchStock(id);
		return ResponseEntity.ok(stock);
	}

}
