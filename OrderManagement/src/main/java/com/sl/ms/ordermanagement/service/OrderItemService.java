package com.sl.ms.ordermanagement.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sl.ms.ordermanagement.model.Order;
import com.sl.ms.ordermanagement.model.OrderItems;

@Service
@Transactional
public class OrderItemService {

	@Autowired
	private OrderItemsRepository orderitemsrepo;

		
	  public List<OrderItems> listAllOrderItems(Integer orderid) {
	  //List<OrderItems> OrderItems = new ArrayList<>(); 
	   return  orderitemsrepo.findByOrderid(orderid);
	  
	  }
	 
	
	
	
	public List<OrderItems> listAll() {
		return orderitemsrepo.findAll();
	}

	public void save(OrderItems orderitems) {
		orderitemsrepo.save(orderitems);
	}


    public OrderItems get(Integer id) {
        return orderitemsrepo.findById(id).get();
    }

	public void delete(Integer id) {
		orderitemsrepo.deleteById(id);
	}
}
