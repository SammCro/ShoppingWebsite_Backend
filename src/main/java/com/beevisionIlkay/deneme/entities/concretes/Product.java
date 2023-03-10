package com.beevisionIlkay.deneme.entities.concretes;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Table(name="products")
@Entity
@Data
public class Product {
	
	@Id
	@GeneratedValue
	@Column(name="product_id")
	private int id;
	@Column(name="category_id")
	private int categoryId;
	@Column(name="product_name")
	private String productName;
	@Column(name="unit_price")
	private double unitPrice;
	@Column(name="units_in_stock")
	private short unitsInStock;
	@Column(name = "quantity_per_unit")
	private String quantityPerUnit;
}
