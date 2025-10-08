package com.productinfo.service;

import java.util.List;

import com.productinfo.model.Product;

public interface IProductInfoService {
	List<Product> getAll();
	List<Product> getByCategory(String category);
	Product getProductInfoById(int id);
}

