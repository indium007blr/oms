package com.indium.oms_stock_service.Entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Stock  implements Serializable{
	
	@Id()
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "stock_id")
	private Integer stockId ;
	@Column(name = "stock_name")
	private String stockName ;
	@Column(name = "stock_quantity")
	private Integer stock_quantity; 
	@Column(name = "stock_price")
	private Float  stockPrice ;
	public Integer getStockId() {
		return stockId;
	}
	public void setStockId(Integer stockId) {
		this.stockId = stockId;
	}
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	public Integer getStock_quantity() {
		return stock_quantity;
	}
	public void setStock_quantity(Integer stock_quantity) {
		this.stock_quantity = stock_quantity;
	}
	public Float getStockPrice() {
		return stockPrice;
	}
	public void setStockPrice(Float stockPrice) {
		this.stockPrice = stockPrice;
	}
	

}
