package com.indium.dto;

import java.util.concurrent.atomic.AtomicInteger;

import lombok.Getter;
import lombok.Setter;

public class OrderDTO {

	public static AtomicInteger idOrder=new AtomicInteger(0);
	
	
	
	private String order_item;
	
	private Integer order_quantity;
	
	private String order_type;
	
	private String order_status;

	public String getOrder_item() {
		return order_item;
	}

	public void setOrder_item(String order_item) {
		this.order_item = order_item;
	}

	public Integer getOrder_quantity() {
		return order_quantity;
	}

	public void setOrder_quantity(Integer order_quantity) {
		this.order_quantity = order_quantity;
	}

	public String getOrder_type() {
		return order_type;
	}

	public void setOrder_type(String order_type) {
		this.order_type = order_type;
	}

	public String getOrder_status() {
		return order_status;
	}

	public void setOrder_status(String order_status) {
		this.order_status = order_status;
	}
	
	
	
	
}
