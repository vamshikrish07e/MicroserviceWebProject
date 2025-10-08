package com.productinventory.service;

import java.util.List;
import java.util.Optional;

import com.productinventory.model.Inventory;

public interface IProductInventoryService {
	
	List<Inventory> getAllStock();
	
	Optional<Inventory> getById(int id);

}
