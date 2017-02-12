package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {

	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@Column(name="customer_id")
	private int id;
	@Column(name="customer_name")
	private String name;
	
	@OneToOne
	@JoinColumn(name="customer_id_fk")
	private Address address;
	
	public Customer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
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
	
	
	
	

}
