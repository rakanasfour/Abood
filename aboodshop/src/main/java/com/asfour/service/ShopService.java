package com.asfour.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asfour.entity.Product;
import com.asfour.repo.ShopRepo;

@Service
public class ShopService {
	
	@Autowired
	ShopRepo repo;
	
	
	public List<Product> showProductInService(){
		
		return repo.findAll();
	}
	
	
	
	public Product addProductInService(Product item ) {
		
		
		return repo.save(item);
	}

}
