package com.Sarvesh.Hibernate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="CustomerAnnotationTable")
public class CustomerAnnotation {
	@Id
	@GeneratedValue
	@Column(name="id")
	public int id;
	@Column(name="name")
	public String name;
	@Column(name="address")
	public String address;
	
	
	public CustomerAnnotation() {
		super();
		// TODO Auto-generated constructor stub
	}


	public CustomerAnnotation(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}


	@Override
	public String toString() {
		return "CustomerAnnotation [id=" + id + ", name=" + name + ", address=" + address + "]";
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	
}
