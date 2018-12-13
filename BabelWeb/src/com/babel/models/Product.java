package com.babel.models;

public class Product {
	int productId;
	String description;
	Double price;
	String uM;
	
	//empty constructor
	public Product() {
		
	}
	
	//default constructor
	public Product(String description) {
		this.productId = 0;
		this.description = description;
		this.price = 0.0;
		this.uM = "um"; 
	}
	
	public Product(int productid, String description, Double nprice, String unidadmedida) {
		this.productId = productid;
		this.description = description;
		this.price = nprice;
		this.uM = unidadmedida; 
	}

	/**
	 * @return the productId
	 */
	public int getProductId() {
		return productId;
	}

	/**
	 * @param productId the productId to set
	 */
	public void setProductId(int productId) {
		this.productId = productId;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the price
	 */
	public Double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(Double price) {
		this.price = price;
	}

	/**
	 * @return the uM
	 */
	public String getuM() {
		return uM;
	}

	/**
	 * @param uM the uM to set
	 */
	public void setuM(String uM) {
		this.uM = uM;
	}
}
