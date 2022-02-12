package com.capeta.springjpademo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capeta.springjpademo.entity.Product;
import com.capeta.springjpademo.repository.ProductRepository;


@Service
public class ProductServiceImp implements ProductService{
	
	@Autowired
	ProductRepository productRepository;
	
	public void createProduct(Product product) {
		// TODO Auto-generated method stub
		productRepository.save(product);
	}
	
	public List<Product> getProduct() {
		// TODO Auto-generated method stub
		return (List<Product>) productRepository.findAll();
	}
}
