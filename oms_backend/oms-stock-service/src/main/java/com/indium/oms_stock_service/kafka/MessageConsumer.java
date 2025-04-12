package com.indium.oms_stock_service.kafka;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.indium.oms_stock_service.Entity.Order;
import com.indium.oms_stock_service.Entity.Stock;
import com.indium.oms_stock_service.repository.StockRepositry;

@Component
public class MessageConsumer {
	
	@Autowired
     private StockRepositry stockRepositry;
    @KafkaListener(topics = "team4", groupId = "my-group-id")
    public void listen(String message) throws JsonMappingException, JsonProcessingException {
    	System.out.println("************"+message);
    	ObjectMapper objectMapper = new ObjectMapper();
    	Order order = objectMapper.readValue(message, Order.class);
    	
    Stock stock =	stockRepositry.findByStockName(order.getOrder_item());
    Integer availableQuantity = stock.getStock_quantity();
    Integer remQuantity  ;
    if(order.getOrder_type().equalsIgnoreCase("sell"))
    {
    	  remQuantity  =availableQuantity+order.getOrder_quantity();
    	 stock.setStock_quantity(remQuantity);
    	 stockRepositry.save(stock);
    }else if(availableQuantity>order.getOrder_quantity())
    {
    	  remQuantity  =availableQuantity-order.getOrder_quantity();
     	 stock.setStock_quantity(remQuantity);
     	 stockRepositry.save(stock);
    }
   
    	
       
    }

}