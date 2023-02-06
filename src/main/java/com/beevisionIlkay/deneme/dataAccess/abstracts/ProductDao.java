package com.beevisionIlkay.deneme.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.beevisionIlkay.deneme.entities.concretes.Product;

public interface ProductDao  extends JpaRepository<Product, Integer>{
    
}
