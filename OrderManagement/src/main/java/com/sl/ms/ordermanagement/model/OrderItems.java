package com.sl.ms.ordermanagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
@Table(name="sl_items")
public class OrderItems {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name="id")
	private Integer item_id;
    
    @Column(name="orderid")
    private Integer orderid;
    
    @Column(name="name")
    private String item_name;
    
    @Column(name="quantity")
    private Integer item_qty;

    @Column(name="price")
    private float item_price;
    
    @Column(name="amount")
    private float items_amount;
    
  
    
    public OrderItems() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderItems(Integer item_id, Integer orderid, String item_name, Integer item_qty, float item_price,
			float items_amount) {
		super();
		this.item_id = item_id;
		this.orderid = orderid;
		this.item_name = item_name;
		this.item_qty = item_qty;
		this.item_price = item_price;
		this.items_amount = items_amount;
	}

	@Override
	public String toString() {
		return "OrderItems [item_id=" + item_id + ", orderid=" + orderid + ", item_name=" + item_name + ", item_qty="
				+ item_qty + ", item_price=" + item_price + ", items_amount=" + items_amount + "]";
	}

	public Integer getItem_id() {
		return item_id;
	}

	public void setItem_id(Integer item_id) {
		this.item_id = item_id;
	}

	public Integer getOrderid() {
		return orderid;
	}

	public void setOrderid(Integer orderid) {
		this.orderid = orderid;
	}

	public String getItem_name() {
		return item_name;
	}

	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}

	public Integer getItem_qty() {
		return item_qty;
	}

	public void setItem_qty(Integer item_qty) {
		this.item_qty = item_qty;
	}

	public float getItem_price() {
		return item_price;
	}

	public void setItem_price(float item_price) {
		this.item_price = item_price;
	}

	public float getItems_amount() {
		return items_amount;
	}

	public void setItems_amount(float items_amount) {
		this.items_amount = items_amount;
	}

	




}
