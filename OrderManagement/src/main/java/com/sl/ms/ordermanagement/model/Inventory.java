package com.sl.ms.ordermanagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sl_inv_items")
public class Inventory {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    @Column(name="id")
	private Integer id;
    
    @Column(name="name")
	private String name;
    
    @Column(name="price")
	private float price;
    
    @Column(name="quantity")
	private Integer quantity;
	
	
	public Inventory() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Inventory(Integer id, String name, float price, Integer quantity) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Inventory [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	
	
	

}
