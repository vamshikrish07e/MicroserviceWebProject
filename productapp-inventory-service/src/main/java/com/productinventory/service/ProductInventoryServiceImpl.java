package com.productinventory.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productinventory.model.Inventory;
import com.productinventory.util.TotalStock;

@Service
public class ProductInventoryServiceImpl implements IProductInventoryService {
	
	@Autowired
	private TotalStock stock;

	@Override
	public List<Inventory> getAllStock() {
		
		return stock.showAllStock();
	}

	@Override
	public Optional<Inventory> getById(int productId) {
		
		return stock.showAllStock().stream()
				.filter(inve->inve.getProductId()==productId)
				.findFirst();
	}

}
