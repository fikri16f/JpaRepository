package com.juaracoding.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.juaracoding.main.entity.Product;
import com.juaracoding.main.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@PostMapping("/addproduct")
	public Product addProduct (@RequestBody Product product) {
		return productService.saveProduct(product);
	}
	
	@PostMapping("/addproducts")
	public List<Product> addProducts (@RequestBody List<Product> products) {
		return productService.saveProducts(products);
	}
	
	@GetMapping("/getproduct")
	public List<Product> findAllProduct(){
		return productService.getProduct();
	}
	
	@GetMapping("/getproductbyid/{id}")
	public Product findProductById(@PathVariable int id) {
		return productService.getAllProductById(id);
	}
	
	@GetMapping("/getproductbyname/{name}")
	public Product findProductByName(@PathVariable String name) {
		return productService.getProductByName(name);
	}
	
}
