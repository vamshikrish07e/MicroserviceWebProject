package com.productcatalog.util;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.productcatalog.model.Product;

@Component
public class ProductDetails {
	
	
	
	public List<Product> showProducts(){
		return Arrays.asList(
				new Product("Mobile",1,"samsung","electronics",18000),
				new Product("Laptop",2,"dell","electronics",19000),
				new Product("Ball",3,"nike","sports",1000),
				new Product("Speaker",4,"bosch","electronics",10000),
				new Product("Shoes",5,"adidas","sports",5000),
				new Product("Television",6,"sony","electronics",15000)
				
				);
	}

}
