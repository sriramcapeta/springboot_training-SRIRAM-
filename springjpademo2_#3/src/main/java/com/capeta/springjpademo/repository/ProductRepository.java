package com.capeta.springjpademo.repository;

import org.springframework.data.repository.CrudRepository;

import com.capeta.springjpademo.entity.Product;

public interface ProductRepository extends CrudRepository<Product,Long> {

}
