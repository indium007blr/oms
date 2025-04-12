package com.indium.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.indium.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {

}
