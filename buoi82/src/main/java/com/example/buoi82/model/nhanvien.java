package com.example.buoi82.model;

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
private String manhanvien;
@Column(name = "ten")
private String tennvS;
@Column(name = "tuoi")
private int tuoi;
@Column(name = "diachi")
private String diachi;
@JoinColumn(name = "macongty")
@ManyToOne
congty congty;
public String getManhanvien() {
	return manhanvien;
}
public void setManhanvien(String manhanvien) {
	this.manhanvien = manhanvien;
}
public String getTennvS() {
	return tennvS;
}
public void setTennvS(String tennvS) {
	this.tennvS = tennvS;
}
public int getTuoi() {
	return tuoi;
}
public void setTuoi(int tuoi) {
	this.tuoi = tuoi;
}
public String getDiachi() {
	return diachi;
}
public void setDiachi(String diachi) {
	this.diachi = diachi;
}
public congty getCongty() {
	return congty;
}
public void setCongty(congty congty) {
	this.congty = congty;
}
public nhanvien() {
	super();
	// TODO Auto-generated constructor stub
}

}
