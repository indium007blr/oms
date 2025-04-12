package com.indium.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.indium.dto.OrderDTO;
import com.indium.entity.Order;
import com.indium.repository.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepository;
	
	public Order createOrder(OrderDTO orderDto) {
		Order order = new Order();
		order.setOrder_id(orderDto.idOrder.getAndIncrement());
		order.setOrder_item(orderDto.getOrder_item());
		order.setOrder_quantity(orderDto.getOrder_quantity());
		order.setOrder_status(orderDto.getOrder_status());
		order.setOrder_type(orderDto.getOrder_type());
		return orderRepository.save(order);
	}
	
	public List<Order> getAllOrders() {
		return orderRepository.findAll();
	}

}
