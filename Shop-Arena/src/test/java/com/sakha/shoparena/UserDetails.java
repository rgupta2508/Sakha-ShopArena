package com.sakha.shoparena;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="user_Detail")
public class UserDetails {
    
    //Columns of Table "USERDETAILS"
	@Id
    @Column(name = "user_id", unique = true, nullable = false)
    @GeneratedValue
    private long id;
	@ManyToMany(targetEntity=Product.class,mappedBy="user_Detail")
    @Column(name = "first_name")
    String firstName;
    
    @Column(name = "last_name")
    String lastName;
    
    @Column(name = "email")
    String email;
    
    @Column(name = "phone")
    long phone;
    
    @Column(name = "password")
    String password;
    
    
    //Default Constructor
    public UserDetails() {
        super();
    }

    //Parameterized Constructor
    public UserDetails(String firstName, String lastName, String email, long phone, String password) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.password = password;
    }

    //Getters and Setters
    
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
   
}
