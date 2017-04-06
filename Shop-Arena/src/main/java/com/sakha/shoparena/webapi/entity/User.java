package com.sakha.shoparena.webapi.entity;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.CascadeType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "user",  uniqueConstraints = {
		@UniqueConstraint(columnNames = "userName") })
public class User implements java.io.Serializable {

	private Long userId;
	private String userFirstName;
	private String userName;
	private Set<Product> products = new HashSet<Product>(0);

	public User() {
	}

	public User(String userFirstName, String userName) {
		this.userFirstName = userFirstName;
		this.userName = userName;
	}

	public User(String userFirstName, String userName, Set<Product> products) {
		this.userFirstName = userFirstName;
		this.userName = userName;
		this.products = products;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "userId", unique = true, nullable = false)
	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@Column(name = "userFirstName", nullable = false)
	public String getFirstName() {
		return this.userFirstName;
	}

	public void setFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	@Column(name = "userName", unique = true, nullable = false, length = 20)
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@JsonIgnore
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "user_product",  joinColumns = {
			@JoinColumn(name = "userId", nullable = false, updatable = false) },
			inverseJoinColumns = { @JoinColumn(name = "productId",
					nullable = false, updatable = false) })
	public Set<Product> getProducts() {
		return this.products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}

}