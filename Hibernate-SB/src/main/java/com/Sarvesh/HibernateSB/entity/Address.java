package com.Sarvesh.HibernateSB.entity;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;

import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "address")
public class Address {
	@Id
	@GeneratedValue
	@Column(name="addressId")
	private int addressId;
	@Column(name="pincode")
	private int pincode;
	@Column(name="address")
	private String address;
	
	@OneToOne(mappedBy = "address")
	@Cascade(CascadeType.SAVE_UPDATE)
	private Employee employee;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Address(int addressId, int pincode, String address) {
		super();
		this.addressId = addressId;
		this.pincode = pincode;
		this.address = address;

	}
	public Address(Address addressObject) {
		super();
		this.addressId = addressObject.getAddressId();
		this.pincode = addressObject.getPincode();
		this.address = addressObject.getAddress();
	}


	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Address [pincode=" + pincode + ", address=" + address + ", employee=" + employee + "]";
	}
	
	
	
	
}
