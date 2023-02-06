package com.beevisionIlkay.deneme.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.beevisionIlkay.deneme.business.abstracts.ProductService;
import com.beevisionIlkay.deneme.entities.concretes.Product;

@RestController
@RequestMapping("/api/products")
@CrossOrigin
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@GetMapping("/getAll")
	public List<Product> getAll(){
		return this.productService.getAll();
	}
}
