package com.example.buoi86.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "phongban")
public class phongban {
@Id
@Column(name = "maphongban")
String maphongban;
@Column(name = "tenphongban")
String tenphongban;
@Column(name = "ngaythanhlap")
Date ngaythanhlap;
@JsonBackReference
@OneToMany(mappedBy = "phongban")
List<nhanvien>nhanviens;
public String getMaphongban() {
	return maphongban;
}
public void setMaphongban(String maphongban) {
	this.maphongban = maphongban;
}
public String getTenphongban() {
	return tenphongban;
}
public void setTenphongban(String tenphongban) {
	this.tenphongban = tenphongban;
}
public Date getNgaythanhlap() {
	return ngaythanhlap;
}
public void setNgaythanhlap(Date ngaythanhlap) {
	this.ngaythanhlap = ngaythanhlap;
}
public List<nhanvien> getNhanviens() {
	return nhanviens;
}
public void setNhanviens(List<nhanvien> nhanviens) {
	this.nhanviens = nhanviens;
}
public phongban(String maphongban, String tenphongban, Date ngaythanhlap, List<nhanvien> nhanviens) {
	super();
	this.maphongban = maphongban;
	this.tenphongban = tenphongban;
	this.ngaythanhlap = ngaythanhlap;
	this.nhanviens = nhanviens;
}
public phongban() {
	super();
	// TODO Auto-generated constructor stub
}


}
