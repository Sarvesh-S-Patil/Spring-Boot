package com.Sarvesh.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name ="CustomerAnnotationTable")
public class customerAnnotation {
	@Id
	@GeneratedValue
	@Column(name="id")
	public int id;
	@Column(name="name")
	public String name;
	@Column(name="address")
	public String address;
	@OneToOne
	@PrimaryKeyJoinColumn
	CustomerTransaction transaction;
	
	
	public customerAnnotation() {
		super();
		// TODO Auto-generated constructor stub
	}


	

	public CustomerTransaction getTransaction() {
		return transaction;
	}




	public void setTransaction(CustomerTransaction transaction) {
		this.transaction = transaction;
	}




	public customerAnnotation(int id, String name, String address, CustomerTransaction transaction) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.transaction = transaction;
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
