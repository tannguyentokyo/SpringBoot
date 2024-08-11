package com.example.buoi86.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "nhanvien")
public class nhanvien {
@Id
@Column(name = "manhanvien")
String manv;
@Column(name = "tennhanvien")
String tennv;
@Column(name = "tuoinhanvien")
int tuoinv;
@Column(name = "diachi")
String diachi;
@JoinColumn(name = "maphongban")
@ManyToOne
phongban phongban;
public String getManv() {
	return manv;
}
public void setManv(String manv) {
	this.manv = manv;
}
public String getTennv() {
	return tennv;
}
public void setTennv(String tennv) {
	this.tennv = tennv;
}
public int getTuoinv() {
	return tuoinv;
}
public void setTuoinv(int tuoinv) {
	this.tuoinv = tuoinv;
}
public String getDiachi() {
	return diachi;
}
public void setDiachi(String diachi) {
	this.diachi = diachi;
}
public phongban getPhongban() {
	return phongban;
}
public void setPhongban(phongban phongban) {
	this.phongban = phongban;
}
public nhanvien(String manv, String tennv, int tuoinv, String diachi, com.example.buoi86.model.phongban phongban) {
	super();
	this.manv = manv;
	this.tennv = tennv;
	this.tuoinv = tuoinv;
	this.diachi = diachi;
	this.phongban = phongban;
}
public nhanvien() {
	super();
	// TODO Auto-generated constructor stub
}

}
