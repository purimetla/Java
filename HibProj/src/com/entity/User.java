package com.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@Table(name="euser")
@DiscriminatorColumn(name="user_type",discriminatorType=DiscriminatorType.STRING)
public class User {

	public User() {
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@Column(name="user_id")
	private int userID;
	@Column(name="firstName")
	private String firstName;
	@Column(name="lastName")
	private String lastName;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="user_address_id")
//	private Address address;
	private Address1 address;
	
		
	
	public Address1 getAddress() {
		return address;
	}


	public void setAddress(Address1 address) {
		this.address = address;
	}


	public User(int userID, String firstName, String lastName) {
		super();
		this.userID = userID;
		this.firstName = firstName;
		this.lastName = lastName;
	}


	public int getUserID() {
		return userID;
	}


	public void setUserID(int userID) {
		this.userID = userID;
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
	
	
	
	

}
