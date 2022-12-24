package com.Polyt.EmpDemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Edemo {
	
	@Id
	private int id;
	private String name;
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
	@Override
	public String toString() {
		return "Edemo [id=" + id + ", name=" + name + "]";
	}
	
	

}
