package com.sl.ms.ordermanagement.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="sl_orders")
public class Order {
		   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    @Column(name="id")
    private Integer id;
       
   
    @Column(name="name")
    private String name;

    @Column(name="total_amount")
    private float total_amount;
    
    @OneToMany(targetEntity = OrderItems.class,cascade = CascadeType.ALL)
    @JoinColumn(name="orderid",referencedColumnName="id")
    private List<OrderItems> orderitems;
    
    
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", name=" + name + ", total_amount=" + total_amount + ", orderitems=" + orderitems
				+ "]";
	}
	public Order(Integer id, String name, float total_amount, List<OrderItems> orderitems) {
		super();
		this.id = id;
		this.name = name;
		this.total_amount = total_amount;
		this.orderitems = orderitems;
	}
	public List<OrderItems> getOrderitems() {
		return orderitems;
	}
	public void setOrderitems(List<OrderItems> orderitems) {
		this.orderitems = orderitems;
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

	public float getTotal_amount() {
		return total_amount;
	}
	public void setTotal_amount(float total_amount) {
		this.total_amount = total_amount;
	}
}
