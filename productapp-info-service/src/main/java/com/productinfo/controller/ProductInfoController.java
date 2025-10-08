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
@RequestMapping("/info-service/v1")
public class ProductInfoController {
	
	@Autowired
	private IProductInfoService impl;
	
	//  http://localhost:8082/info-service/v1/productinfo
	@GetMapping("/productinfo")
	List<Product> getAll(){
		return impl.getAll();
	}
	
	@GetMapping("/productinfo/category/{category}")
	List<Product> viewInfoByCategory(@PathVariable String category){
		return impl.getByCategory(category);
	}
	
	@GetMapping("/productinfo/productId/{productId}")
	Product viewProductInfoById(@PathVariable int productId) {
		return impl.getProductInfoById(productId);
	}


}
