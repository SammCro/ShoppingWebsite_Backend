package com.beevisionIlkay.deneme.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beevisionIlkay.deneme.business.abstracts.ProductService;
import com.beevisionIlkay.deneme.dataAccess.abstracts.ProductDao;
import com.beevisionIlkay.deneme.entities.concretes.Product;

@Service
public class ProductManager implements ProductService{
	private ProductDao productDao;
	
	@Autowired
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}
	
	
	@Override
	//samet
	public List<Product> getAll(){
		return this.productDao.findAll();
	}
}
