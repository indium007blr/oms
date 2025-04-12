package com.indium.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.indium.dto.OrderDTO;
import com.indium.entity.Order;
import com.indium.kafka.MessageProducer;
import com.indium.service.OrderService;

@RestController
@RequestMapping("/api/v1/oms")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@Autowired
    private MessageProducer messageProducer;
	
	@GetMapping("/orders")
	public List<Order> getAllOrders() {
		return orderService.getAllOrders();
	}
	
	@PostMapping("/buy-order")
	public Order buyOrder(@RequestBody OrderDTO order) {		
		Order orderResp =  orderService.createOrder(order);
		

        ObjectMapper om = new ObjectMapper();
        String json = "";
        
        try {
        	json = om.writeValueAsString(orderResp);
		} catch (JsonProcessingException e) {
			
		}

		
		messageProducer.sendMessage("team4", json);
		return orderResp;
		
	}

}
