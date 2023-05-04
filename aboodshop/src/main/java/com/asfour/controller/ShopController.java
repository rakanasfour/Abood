package com.asfour.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.asfour.entity.Product;
import com.asfour.service.ShopService;

@Controller
@RestController
public class ShopController {
	
	@Autowired
	ShopService service;
	
	
	
	
	
	@GetMapping("/showProducts")
	public List<Product> showProduct(){
		
		return service.showProductInService();
		
	}
	
	
	@PostMapping("/addProducts")
	public Product addProduct(@RequestBody Product item) {
		
		return service.addProductInService(item);
		
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
