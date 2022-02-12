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
	
	public Product() {
		
	}
	
	public Product(long pid, String pname, double price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
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
	
	
	

}
