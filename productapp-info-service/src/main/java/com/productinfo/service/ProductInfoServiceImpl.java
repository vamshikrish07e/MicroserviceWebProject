package com.productinfo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.productinfo.model.Inventory;
import com.productinfo.model.Product;

@Service
public class ProductInfoServiceImpl implements IProductInfoService {
	
	@Autowired
	RestTemplate restTemplate;

	String BASEURL="http://PRODUCT-CATALOG/catalog-service/v1/productcatalog";
	String INURL="http://PRODUCT-INVENTORY/inventory-service/v1/productinventory";
	
	@Override
	public List<Product> getAll() {
		//String url="http://localhost:8081/catalog-service/v1/productcatalog";
        Product[] products= restTemplate.getForObject(BASEURL, Product[].class);
        Inventory[] inventory=restTemplate.getForObject(INURL, Inventory[].class);
        List<Product> productList=new ArrayList<>();
        for(Inventory inventory1:inventory) {
        	for(Product product:products) {
        		if(product.getProductId()==inventory1.getProductId()) {
        			product.setStock(inventory1.getQuantity());
        			productList.add(product);
        		}
        	}
        }
		return productList;
	}

	@Override
	public List<Product> getByCategory(String category) {
		String url=BASEURL.concat("/category/").concat(category);
		return restTemplate.getForObject(url, List.class);
	}

	@Override
	public Product getProductInfoById(int id) {
		String url=BASEURL.concat("/productId/")+id;
		return restTemplate.getForObject(url, Product.class);
	}

}
