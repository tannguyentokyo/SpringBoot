package com.example.buoi81.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hocsinh")
public class HocSinh {
@Id
@Column(name="Mahocsinh")
String maHocSinh;
@Column(name="Ten")
String tenString;
@Column(name="Tuoi")
int tuoi;
@Column(name="diachi")
String diachiString;
public String getMaHocSinh() {
	return maHocSinh;
}
public void setMaHocSinh(String maHocSinh) {
	this.maHocSinh = maHocSinh;
}
public String getTenString() {
	return tenString;
}
public void setTenString(String tenString) {
	this.tenString = tenString;
}
public int getTuoi() {
	return tuoi;
}
public void setTuoi(int tuoi) {
	this.tuoi = tuoi;
}
public String getDiachiString() {
	return diachiString;
}
public void setDiachiString(String diachiString) {
	this.diachiString = diachiString;
}
public HocSinh(String maHocSinh, String tenString, int tuoi, String diachiString) {
	super();
	this.maHocSinh = maHocSinh;
	this.tenString = tenString;
	this.tuoi = tuoi;
	this.diachiString = diachiString;
}
public HocSinh() {
	super();
	// TODO Auto-generated constructor stub
}

}
