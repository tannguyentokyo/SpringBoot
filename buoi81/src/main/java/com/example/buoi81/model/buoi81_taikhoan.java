package com.example.buoi81.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "taikhoan")
public class buoi81_taikhoan {
	@Id
	@Column(name = "Mataikhoan")
	String mataikhoan;
	@Column(name = "Tentaikhoan")
	String tentaikhoan;
	@Column(name = "Sotien")
	int sotien;
	public String getMataikhoan() {
		return mataikhoan;
	}
	public void setMataikhoan(String mataikhoan) {
		this.mataikhoan = mataikhoan;
	}
	public String getTentaikhoan() {
		return tentaikhoan;
	}
	public void setTentaikhoan(String tentaikhoan) {
		this.tentaikhoan = tentaikhoan;
	}
	public int getSotien() {
		return sotien;
	}
	public void setSotien(int sotien) {
		this.sotien = sotien;
	}
//	public buoi81_taikhoan(String mataikhoan, String tentaikhoan, int sotien) {
//		super();
//		this.mataikhoan = mataikhoan;
//		this.tentaikhoan = tentaikhoan;
//		this.sotien = sotien;
//	
// *********************** constructor như bình thường không cần thiết  ********************************
	public buoi81_taikhoan() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
