package com.productcatalog.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.productcatalog.model.Product;
import com.productcatalog.service.IProductCataloService;

@RestController
@RequestMapping("/catalog-service/v1")
public class ProductCatalogController {
	
	@Autowired
	private IProductCataloService iProductCataloService;
	
	//  http://localhost:8081/catalog-service/v1/productcatalog
	
	@GetMapping("/productcatalog")
	List<Product> getAll(){
		return iProductCataloService.getAll();
	}

//  http://localhost:8081/catalog-service/v1/productcatalog/category/sports
	
	@GetMapping("/productcatalog/category/{category}")
	List<Product> getByCategory(@PathVariable String category){
		return iProductCataloService.getByCategory(category);
	}
	
//  http://localhost:8081/catalog-service/v1/productcatalog/productId/1
	
    @GetMapping("/productcatalog/productId/{productId}")
	Product getById(@PathVariable int productId){
    Optional<Product> productopt=	iProductCataloService.getById(productId);
		return productopt.orElse(new Product());
	}
}
