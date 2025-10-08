package com.productapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.productapp.model.Product;

@Service
public class ProductServiceImpl implements IProductService {
	
	@Autowired
	RestTemplate restTemplate;
	
	private String BASEURL="http://localhost:8082/info-service/v1/productinfo";

	@Override
	public List<Product> getAll() {
		return restTemplate.getForObject(BASEURL, List.class);
	}

	@Override
	public List<Product> getByCategory(String category) {
		String url=BASEURL.concat("/category/").concat(category);
		return restTemplate.getForObject(url, List.class);
	}

	@Override
	public Product getById(int id) {
		String url=BASEURL.concat("/productId/")+id;
		return restTemplate.getForObject(url, Product.class);
	}
	
}
