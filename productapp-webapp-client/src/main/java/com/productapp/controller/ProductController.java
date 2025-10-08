package com.productapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.productapp.model.Product;
import com.productapp.service.IProductService;

@Controller
public class ProductController {
	
	@Autowired
	private IProductService iProductService;
	
	@GetMapping("/")
public String getAllProducts(Model model){
		List<Product> products=iProductService.getAll();
		model.addAttribute("products", products);
	return "home";
}
}
