package com.productinfo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.productinfo.model.Product;
import com.productinfo.service.IProductInfoService;

@RestController
@RequestMapping("/infostock-service/v1")
public class ProductInfoStockController {
	
	@Autowired
	private IProductInfoService impl;
	
	//  http://localhost:8082/infostock-service/v1/productstock
	@GetMapping("/productstock")
	List<Product> getAll(){
		return impl.getAll();
	}
	
	//  http://localhost:8082/infostock-service/v1/sports
	
	@GetMapping("/productstock/category/{category}")
	List<Product> viewInfoByCategory(@PathVariable String category){
		return impl.getByCategory(category);
	}
	
	//  http://localhost:8082/infostock-service/v1/1
	
	@GetMapping("/productstock/productId/{productId}")
	Product viewProductInfoById(@PathVariable int productId) {
		return impl.getProductInfoById(productId);
	}


}
