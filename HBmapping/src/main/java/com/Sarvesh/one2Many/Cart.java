package com.Sarvesh.one2Many;

import java.util.Set;

public class Cart {
	int cartId;
	int totalBill;
	Set<Item> items;
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cart(int cartId, int totalBill, Set<Item> items) {
		super();
		this.cartId = cartId;
		this.totalBill = totalBill;
		this.items = items;
	}
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public int getTotalBill() {
		return totalBill;
	}
	public void setTotalBill(int totalBill) {
		this.totalBill = totalBill;
	}
	public Set<Item> getItems() {
		return items;
	}
	public void setItems(Set<Item> items) {
		this.items = items;
	}
	
	
	
}
