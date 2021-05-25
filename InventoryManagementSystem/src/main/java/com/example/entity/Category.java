package com.example.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
public class Category {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int categoryId;
	private String CategoryName;
	
	@OneToMany(mappedBy="category")
	private List<Product> products;
	
	@OneToMany(mappedBy="category")
	private List<Stock> stocks;

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return CategoryName;
	}

	public void setCategoryName(String categoryName) {
		CategoryName = categoryName;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public List<Stock> getStocks() {
		return stocks;
	}

	public void setStocks(List<Stock> stocks) {
		this.stocks = stocks;
	}

	public Category(int categoryId, String categoryName, List<Product> products, List<Stock> stocks) {
		super();
		this.categoryId = categoryId;
		CategoryName = categoryName;
		this.products = products;
		this.stocks = stocks;
	}

	public Category() {
		super();
	}

	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", CategoryName=" + CategoryName + ", products=" + products
				+ ", stocks=" + stocks + "]";
	}
	
	

}
