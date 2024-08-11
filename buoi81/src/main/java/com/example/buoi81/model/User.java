package com.example.buoi81.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User")
public class User {
	@Id
	@Column(name = "id")
private	Integer id;
	@Column(name = "ten")
private	String ten;
	@Column(name = "tuoi")
	Integer tuoi;
	

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public Integer getTuoi() {
		return tuoi;
	}
	public void setTuoi(Integer tuoi) {
		this.tuoi = tuoi;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}



}
