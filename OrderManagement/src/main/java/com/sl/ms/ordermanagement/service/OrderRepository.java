package com.sl.ms.ordermanagement.service;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sl.ms.ordermanagement.model.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {
	public Optional<Order> findById(Integer id);
}