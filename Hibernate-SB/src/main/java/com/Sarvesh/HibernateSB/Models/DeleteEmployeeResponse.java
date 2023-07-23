package com.Sarvesh.HibernateSB.Models;

import com.Sarvesh.HibernateSB.entity.Address;

public class DeleteEmployeeResponse {
	private int id;
	private String firstName;
	private String lastName;
	private Address address;
	private int status;
	private String message;
	
	public DeleteEmployeeResponse() {
		super();
		// TODO Auto-generated constructor stub
	}



	public DeleteEmployeeResponse(int id, String firstName, String lastName, Address address, int status,
			String message) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.status = status;
		this.message = message;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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


	public Address getAddress() {
		return address;
	}



	public void setAddress(Address address) {
		this.address = address;
	}



	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
}
