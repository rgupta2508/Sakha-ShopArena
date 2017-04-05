package com.sakha.shoparena;

import java.util.HashSet;
import java.util.Set;

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
@Table(name = "product")
public class Product {

	@Column
	@Id
	@GeneratedValue
	
	private int productId;
	@Column
	private String category;
	@Column
	private String brandName;
	@Column
	private String brandVersion;
	@Column
	private byte[] productImage;
	@Column
	private double price;
	@Column
	private String productDesc;
	@ManyToMany(targetEntity = UserDetails.class, cascade = CascadeType.ALL)
	@JoinTable(name = "myCart", joinColumns = @JoinColumn(name = "productId", referencedColumnName = "productId"), inverseJoinColumns = @JoinColumn(name = "userId", referencedColumnName = "userId"))
	private Set<UserDetails> userDetail;

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

	public Set<UserDetails> getUserDetail() {
		return userDetail;
	}

	public void setUserDetail(Set<UserDetails> userDetail) {
		this.userDetail = userDetail;
	}
	

}
