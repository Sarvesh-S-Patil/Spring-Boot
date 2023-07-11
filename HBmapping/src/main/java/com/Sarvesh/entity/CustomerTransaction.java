package com.Sarvesh.entity;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
@Entity
@Table(name="CustomerTransaction")
public class CustomerTransaction {
	@Id
	@GeneratedValue
	@Column(name="id")
	public int id;
	@Column(name="total")
	public int total;
	
	@OneToOne(mappedBy="transaction")
	@Cascade(CascadeType.SAVE_UPDATE)
	public customerAnnotation customer;

	public CustomerTransaction() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CustomerTransaction(int id, int total, customerAnnotation customer) {
		super();
		this.id = id;
		this.total = total;
		this.customer = customer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public customerAnnotation getCustomer() {
		return customer;
	}

	public void setCustomer(customerAnnotation customer) {
		this.customer = customer;
	}
	
	
	
}
