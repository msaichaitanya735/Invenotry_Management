package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

@Document(collection = "orders")
public class Order {

	@Id
	private String orderID;

	@NotNull(message = "RetailerID cannot be null")
	private String retailerID;

	private LocalDate date;
	private double amount;
	private String productId; // Represents a list of products in the order
	private int quantity;
	private String returnable; // New field for returnable status as a String

	// Constructors, getters, and setters...

	// Updated constructor to include returnable
	public Order(String retailerID, double amount, String productId, int quantity, String returnable) {
		this.retailerID = retailerID;
		this.date = LocalDate.now();
		this.amount = amount;
		this.productId = productId;
		this.quantity = quantity;
		this.returnable = returnable;
	}

	// Getter and setter for returnable
	public String getReturnable() {
		return returnable;
	}

	public void setReturnable(String returnable) {
		this.returnable = returnable;
	}

	// Existing getters and setters
	public String getOrderID() {
		return orderID;
	}

	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}

	public String getRetailerID() {
		return retailerID;
	}

	public void setRetailerID(String retailerID) {
		this.retailerID = retailerID;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}


