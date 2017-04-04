package com.sakha.shoparena;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product{

@Column
@Id
@GeneratedValue
private int productId;
@Column	
private String category;
@Column	
@ManyToMany(targetEntity=UserDetails.class,cascade=CascadeType.ALL)
@JoinTable(name="addToCart",joinColumns={@JoinColumn(name="product-id",referencedColumnName="productId"),
		@JoinColumn(name="product-Name",referencedColumnName="brandName"),
		@JoinColumn(name="product-Version",referencedColumnName="brandVersion"),
		@JoinColumn(name="product-Image",referencedColumnName="logo"),
		@JoinColumn(name="price",referencedColumnName="price"),
        },inverseJoinColumns={@JoinColumn(name="user_Id",referencedColumnName="user_id"),
        @JoinColumn(name="user_Id",referencedColumnName="user_id"),
        @JoinColumn(name="user_Name",referencedColumnName="first_name")})
private String brandName;
@Column	
private String brandVersion;

@Column	
private byte[] productImage;
@Column
private double price;
@Column	
private String productDesc;
public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public String getBrandName() {
	return brandName;
}
public void setBrandName(String brandName) {
	this.brandName = brandName;
}
public String getBrandVersion() {
	return brandVersion;
}
public void setBrandVersion(String brandVersion) {
	this.brandVersion = brandVersion;
}
public byte[] getProductImage() {
	return productImage;
}
public void setProductImage(byte[] productImage) {
	this.productImage = productImage;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getProductDesc() {
	return productDesc;
}
public void setProductDesc(String productDesc) {
	this.productDesc = productDesc;
}



}
