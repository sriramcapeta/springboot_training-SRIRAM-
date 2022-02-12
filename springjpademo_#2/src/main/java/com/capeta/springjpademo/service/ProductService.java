package com.capeta.springjpademo.service;

import java.util.List;

import com.capeta.springjpademo.entity.Product;


public interface ProductService {
	public void createProduct(Product product);
	public List<Product> getProduct();
}
