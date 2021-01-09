package com.sl.ms.ordermanagement.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sl.ms.ordermanagement.model.Order;
import com.sl.ms.ordermanagement.model.OrderItems;
import org.springframework.data.jpa.repository.Query;

public interface OrderItemsRepository extends JpaRepository<OrderItems, Integer>{
		
	public List<OrderItems> findByOrderid(Integer orderid);
	
}
