package com.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="supplier")
public class Supplier {

	public Supplier() {
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@Column(name="supplier_id")
	private int id;
	@Column(name="supplier_name")
	private String name;
	
	@OneToMany
	private Set<Product> products;
	
	
	public Supplier(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
