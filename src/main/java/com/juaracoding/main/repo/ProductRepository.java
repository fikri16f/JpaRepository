package com.juaracoding.main.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juaracoding.main.entity.Product;

public interface ProductRepository extends JpaRepository <Product, Integer>{

 Product findByName(String name);
	
	
}
