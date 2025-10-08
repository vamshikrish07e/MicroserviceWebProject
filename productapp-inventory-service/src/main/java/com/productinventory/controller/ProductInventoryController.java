package com.productinventory.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.productinventory.model.Inventory;
import com.productinventory.service.IProductInventoryService;

@RestController
@RequestMapping("inventory-service/v1")
public class ProductInventoryController {

	@Autowired
	private IProductInventoryService inventoryService;
	
	//  http://localhost:8083/inventory-service/v1/productinventory
	
	@GetMapping("/productinventory")
	List<Inventory> getAll(){
		return inventoryService.getAllStock();
	}
	
	
	//  http://localhost:8083/inventory-service/v1/productinventory/productid/1
	
	@GetMapping("/productinventory/productid/{productId}")
	Inventory getById(@PathVariable int productId) {
	Optional<Inventory>	productopt=inventoryService.getById(productId);
	return productopt.orElse(new Inventory());
	}
}
