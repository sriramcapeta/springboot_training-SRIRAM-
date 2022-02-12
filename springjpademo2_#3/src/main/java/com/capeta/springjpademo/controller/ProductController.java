package com.capeta.springjpademo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.capeta.springjpademo.entity.Product;
import com.capeta.springjpademo.service.ProductService;




@RestController
@RequestMapping(value={"/product"})
public class ProductController {
	
	
	@Autowired
	ProductService productService;
	
	
	 @PostMapping(value="/create")
	 public ResponseEntity<Void> createUser(@RequestBody Product product, UriComponentsBuilder ucBuilder){
	     System.out.println("Creating Product "+product.getPname());
	     productService.createProduct(product);
	     HttpHeaders headers = new HttpHeaders();
	     headers.setLocation(ucBuilder.path("/product/{id}").buildAndExpand(product.getPid()).toUri());
	     return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	 }

	 
	 @GetMapping(value="/products")
	 public List<Product> getAllUser() {	 
	  List<Product> tasks=productService.getProduct();
	  return tasks;
	
	 }
	 
	 
	 	@PutMapping(value="/update")
		public Product updateUser(@RequestBody Product currentProduct)
		{
			System.out.println("updating....");
		Product product = productService.findById(currentProduct.getPid());		
		return productService.update(currentProduct, currentProduct.getPid());
		
		}
}
