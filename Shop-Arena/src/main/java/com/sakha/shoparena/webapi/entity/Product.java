package com.sakha.shoparena.webapi.entity;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "product")
public class Product implements java.io.Serializable {

	private Long productId;
	private String name;
	private String desc;
	private Set<User> users = new HashSet<User>(0);

	public Product() {
	}

	public Product(String name, String desc) {
		this.name = name;
		this.desc = desc;
	}

	public Product(String name, String desc, Set<User> users) {
		this.name = name;
		this.desc = desc;
		this.users = users;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "productId", unique = true, nullable = false)
	public Long getProductId() {
		return this.productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	@Column(name = "NAME", nullable = false, length = 10)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "[DESC]", nullable = false)
	public String getDesc() {
		return this.desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@JsonIgnore
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "products")
	public Set<User> getUsers() {
		return this.users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

}