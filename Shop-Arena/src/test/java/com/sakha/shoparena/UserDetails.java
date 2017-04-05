package com.sakha.shoparena;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "userDetails")
public class UserDetails {
	@Id
	@Column(name = "userId", unique = true, nullable = false)
	@GeneratedValue
	
	private long id;
	@ManyToMany(targetEntity = Product.class)
    private Set product;
	@Column(name = "firstName")
	String firstName;

	@Column(name = "lastLame")
	String lastName;

	@Column(name = "email")
	String email;

	@Column(name = "phone")
	long phone;

	@Column(name = "password")
	String password;

	// Default Constructor
	public UserDetails() {
		super();
	}

	// Parameterized Constructor
	public UserDetails(String firstName, String lastName, String email, long phone, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.password = password;
	}

	// Getters and Setters

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set getProduct() {
		return product;
	}

	public void setProduct(Set product) {
		this.product = product;
	}
	

}
