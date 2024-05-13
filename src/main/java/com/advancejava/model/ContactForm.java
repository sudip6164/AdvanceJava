package com.advancejava.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ContactForm {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int contacttId;
    private String name;
    private String email;
    private String subject;
    private String message;
    
	public int getContacttId() {
		return contacttId;
	}
	public void setContacttId(int contacttId) {
		this.contacttId = contacttId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}


}
