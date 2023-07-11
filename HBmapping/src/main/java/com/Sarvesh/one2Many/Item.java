package com.Sarvesh.one2Many;

public class Item {
	int itemId;
	String name;
	int price;
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Item(int itemId, String name, int price) {
		super();
		this.itemId = itemId;
		this.name = name;
		this.price = price;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	

	

}
