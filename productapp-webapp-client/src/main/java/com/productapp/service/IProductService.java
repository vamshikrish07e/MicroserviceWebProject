package com.productapp.service;

import java.util.List;

import com.productapp.model.Product;

public interface IProductService {
	
	List<Product> getAll();

	List<Product> getByCategory(String category);

	Product getById(int id);


}
