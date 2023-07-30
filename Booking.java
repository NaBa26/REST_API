package com.springbootproject.SpringREST.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Booking {

	@Id
	private long id;
	
	private String name;
	private String details;
	public Booking(long id, String name, String details) {
		super();
		this.id = id;
		this.name = name;
		this.details = details;
	}
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	
	@Override
	public String toString() {
		return "Booking [id=" + id + ", name=" + name + ", details=" + details + "]";
	}
	
}
