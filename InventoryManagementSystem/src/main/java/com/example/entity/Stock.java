package com.example.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
public class Stock {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int refId;
	private int branchId;
	private Date dateStock;
	private int quantity;

	@ManyToOne
	@JoinColumn(name = "productId")
	private Product product;

	@ManyToOne
	@JoinColumn(name = "categoryid")
	private Category category;

	public int getRefId() {
		return refId;
	}

	public void setRefId(int refId) {
		this.refId = refId;
	}

	public int getBranchId() {
		return branchId;
	}

	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}

	public Date getDateStock() {
		return dateStock;
	}

	public void setDateStock(Date dateStock) {
		this.dateStock = dateStock;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Stock(int refId, int branchId, Date dateStock, int quantity, Product product, Category category) {
		super();
		this.refId = refId;
		this.branchId = branchId;
		this.dateStock = dateStock;
		this.quantity = quantity;
		this.product = product;
		this.category = category;
	}

	public Stock() {
		super();
	}

	@Override
	public String toString() {
		return "Stock [refId=" + refId + ", branchId=" + branchId + ", dateStock=" + dateStock + ", quantity="
				+ quantity + ", product=" + product + ", category=" + category + "]";
	}

}
