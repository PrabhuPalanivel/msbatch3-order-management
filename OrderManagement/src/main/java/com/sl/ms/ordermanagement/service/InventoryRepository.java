package com.sl.ms.ordermanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sl.ms.ordermanagement.model.Inventory;
import com.sl.ms.ordermanagement.model.Order;


public interface InventoryRepository extends JpaRepository<Inventory, Integer> {
	public List<Inventory> findByName(String name);
}
