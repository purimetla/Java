package com.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "item")

public class Item {

	public Item() {
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@Column(name="item_id")
	private int id;
	@Column(name="item_name")
	private String name;
	
//	@OneToMany//in case of unidirectional
	//In case of bidirectional, the owning side should represent the join condition
	//@JoinColumn(name="item_id_fk")//this is in case of unidirectional
	//bids represents association between bids and item
	@OneToMany(mappedBy="item")//in case of bidirectional
	private Set<Bid> bids;
	
	@ManyToMany
	@JoinTable(
			name="item_category"
			,joinColumns ={@JoinColumn(name="item_id_fk")}
			,inverseJoinColumns={@JoinColumn(name="cat_id_fk")}
	)
	
	private Set<Category> categories;
	
	public Set<Category> getCategories() {
		return categories;
	}
	
	public void setCategories(Set<Category> categories) {
		this.categories = categories;
	}
	
	public Item(int id, String name) {
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
	
	public Set<Bid> getBids() {
		return bids;
	}
	
	public void setBids(Set<Bid> bids) {
		this.bids = bids;
	}
	
}
