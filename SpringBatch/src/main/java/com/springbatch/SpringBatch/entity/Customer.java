package com.springbatch.SpringBatch.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CUSTOMERS_INFO")
public class Customer {

	@Id
	@Column(name = "CUSTOMER_ID")
	private int id;
	@Column(name = "FIRST_NAME")
	private String firstName;
	@Column(name = "LAST_NAME")
	private String lastName;
	@Column(name = "EMAIL")
	private String email;
	@Column(name = "GENDER")
	private String gender;
	@Column(name = "CONTACT")
	private String contactNo;
	@Column(name = "COUNTRY")
	private String country;
	@Column(name = "DOB")
	private String dob;
	public int getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getEmail() {
		return email;
	}
	public String getGender() {
		return gender;
	}
	public String getContactNo() {
		return contactNo;
	}
	public String getCountry() {
		return country;
	}
	public String getDob() {
		return dob;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	

}
