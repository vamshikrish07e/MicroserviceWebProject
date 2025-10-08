package com.productinventory.util;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.productinventory.model.Inventory;

@Component
public class TotalStock {
	
	public List<Inventory> showAllStock(){
		return Arrays.asList(
				new Inventory(1,100),
				new Inventory(2,200),
				new Inventory(3,300),
				new Inventory(4,400),
				new Inventory(5,500),
				new Inventory(6,600)
				);
	}

}
