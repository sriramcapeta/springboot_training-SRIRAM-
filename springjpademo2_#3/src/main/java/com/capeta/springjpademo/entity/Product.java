package com.capeta.springjpademo.entity;

import javax.persistence.*;

@Entity
@Table(name="product_table")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long pid;
	
	@Column(name="product_name")
	private String pname;
	
	@Column(name="product_price")
	private double price;
	
	@Column(name="product_discount")
	private int discount;
	
	public Product(long pid, String pname, double price, int discount) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.discount = discount;
	}

	public Product() {
		
	}
	
	
	public long getPid() {
		return pid;
	}
	public void setPid(long pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
	
	

}
