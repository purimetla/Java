package com.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("seller")
public class Seller extends User {

	public Seller() {
		// TODO Auto-generated constructor stub
	}
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="seller_bid_id")
	private Set<Item> items;
	
	@Column(name="credit_balance")
	private float creditBalance;

	public Set<Item> getItems() {
		return items;
	}

	public void setItems(Set<Item> items) {
		this.items = items;
	}

	public float getCreditBalance() {
		return creditBalance;
	}

	public void setCreditBalance(float creditBalance) {
		this.creditBalance = creditBalance;
	}
	
	

}
