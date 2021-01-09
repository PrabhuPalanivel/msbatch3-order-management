package com.sl.ms.ordermanagement.service;

import java.util.List;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sl.ms.ordermanagement.model.Inventory;

@Service
@Transactional
public class InventoryService {
	
	@Autowired
	private InventoryRepository inventoryrepo;
	
	public List<Inventory> listItems(String name)
	{
		return inventoryrepo.findByName(name);
	}

   public List<Inventory> listAll() {
       return inventoryrepo.findAll();
   }
    
   public void save(Inventory order) {
	   inventoryrepo.save(order);
   }
    
   public Inventory get(Integer id) {
       return inventoryrepo.findById(id).get();
   }
    
   public void delete(Integer id) {
	   inventoryrepo.deleteById(id);
   }

}
