package com.mystack.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Passenger {
	
	@Id
    private Integer PassengerId;
    
	@Column(length=15)
    private String firstname;
    
	public Integer getPassengerId() {
		return PassengerId;
	}

	public void setPassengerId(Integer passengerId) {
		PassengerId = passengerId;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Column(length=15)
    private String lastname;
    
	@Column(length=15)
    private String emailId; 
}
