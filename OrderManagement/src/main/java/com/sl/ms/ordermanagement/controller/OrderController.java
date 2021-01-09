package com.sl.ms.ordermanagement.controller;

import java.util.*;
import java.util.function.Consumer;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import com.sl.ms.ordermanagement.model.Inventory;
import com.sl.ms.ordermanagement.model.Order;
import com.sl.ms.ordermanagement.model.OrderItems;
import com.sl.ms.ordermanagement.service.InventoryService;
import com.sl.ms.ordermanagement.service.OrderItemService;
import com.sl.ms.ordermanagement.service.OrderService;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@CrossOrigin()
public class OrderController {

	@Autowired
	private OrderService service;

	@Autowired
	private OrderItemService itemservice;

	@Autowired
	private InventoryService inventoryservice;

	// RESTful API methods for Retrieval operations
	@GetMapping("/orders")
	public List<Order> list() {
		return service.listAll();
	}

	/*
	 * @GetMapping("/orders/{id}") public List<OrderItems> get(@PathVariable Integer
	 * id) {
	 * 
	 * return itemservice.listAllOrderItems(id);
	 * 
	 * 
	 * }
	 */

	@GetMapping("/orders/{id}")
	public Optional<Order> get(@PathVariable Integer id) {

		return service.listAllOrderItems(id);

	}

	/*
	 * @GetMapping("/orders/{id}") public ResponseEntity<OrderItems>
	 * get(@PathVariable Integer id) { try { List<OrderItems> orderItems =
	 * itemservice.listAllOrderItems(id);
	 * 
	 * return new ResponseEntity<OrderItems>((OrderItems) orderItems,
	 * HttpStatus.OK); } catch (NoSuchElementException e) { return new
	 * ResponseEntity<OrderItems>(HttpStatus.NOT_FOUND); } }
	 */

	// RESTful API method for Create operation

	@PostMapping("/orders")
	public void add(@RequestBody Order order) throws CustomException {
		List<OrderItems> Inputorderitems = order.getOrderitems();
		boolean processOrderFlag = true;
		for (int i = 0; i < Inputorderitems.size(); i++) {
			String Inputorderitemname = Inputorderitems.get(i).getItem_name();
			int Inputorderitemqty = Inputorderitems.get(i).getItem_qty();
			System.out.println("Inputorderitemname" + Inputorderitemname);
			System.out.println("Inputorderitemqty" + Inputorderitemqty);

			List<Inventory> Invorderitems = inventoryservice.listItems(Inputorderitemname);

			int Invquantity = Invorderitems.get(0).getQuantity();
			System.out.println("Invquantity" + Invquantity);
			if (Inputorderitemqty <= Invquantity)
				System.out.println("Enough Quantity available for" + Inputorderitemname);
			else {
				processOrderFlag = false;
				System.out.println("Enough Quantity not available for" + Inputorderitemname);
				throw new CustomException();

				// break;
			}

		}
		if (processOrderFlag)
			service.save(order);
	}

	// RESTful API method for Update operation

	@PutMapping("/orders/{id}")
	public ResponseEntity<?> update(@RequestBody Order order, @PathVariable Integer id) {
		try {
			Order existOrder = service.get(id);
			service.save(order);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	// RESTful API method for Delete operation
	@DeleteMapping("/orders/{id}")
	public void delete(@PathVariable Integer id) {
		service.delete(id);
	}

}
