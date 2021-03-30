package com.juaracoding.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juaracoding.main.entity.Product;
import com.juaracoding.main.repo.ProductRepository;

@Service
public class ProductService {
	
@Autowired
private ProductRepository productRepository;

public Product saveProduct (Product product) {
	
	return productRepository.save(product);
}


public List<Product> saveProducts(List<Product> products){
	return productRepository.saveAll(products);
}

public List<Product> getProduct(){
	return productRepository.findAll();
}

public Product getAllProductById(int id) {
	return productRepository.findById(id).orElse(null);
}

public Product getProductByName(String name) {
	return productRepository.findByName(name);
}

}
