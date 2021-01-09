package com.sl.ms.ordermanagement.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sl.ms.ordermanagement.model.Order;
import com.sl.ms.ordermanagement.model.OrderItems;

@Service
@Transactional
public class OrderService {

	@Autowired
	private OrderRepository repo;

	public Optional<Order> listAllOrderItems(Integer orderid) {

		return repo.findById(orderid);

	}

	public List<Order> listAll() {
		return repo.findAll();
	}

	public void save(Order order) {
		repo.save(order);
	}

	public Order get(Integer id) {
		return repo.findById(id).get();
	}

	public void delete(Integer id) {
		repo.deleteById(id);
	}

}
