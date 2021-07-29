package com.example.backend.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class UserModel {
	
	 @Id
	 private String email;
	 private String password;
	 private String username;
	 private String mobileNumber;
	 private boolean active;
	 private String role;
	 @OneToMany(cascade=CascadeType.ALL,mappedBy = "userId")
	 private List<OrderModel> orderList = new ArrayList<>();
	 @OneToOne(cascade = CascadeType.ALL)
	 @GeneratedValue(strategy= GenerationType.IDENTITY)
     private CartModel cart;
	 
	public List<OrderModel> getOrderList() {
		return orderList;
	}
	public void setOrderList(List<OrderModel> orderList) {
		this.orderList = orderList;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public boolean getActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	public CartModel getCart() {
		return cart;
	}
	public void setCart(CartModel cart) {
		this.cart = cart;
	}
	 
	
	 
}

