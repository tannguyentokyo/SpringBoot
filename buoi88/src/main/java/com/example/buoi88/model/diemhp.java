package com.example.buoi88.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "diemhp")
public class diemhp {
@Id
@Column(name = "mahp")
String mahp;
@Column(name = "diemhp")
float diemhp;
@JoinColumn(name = "masv")
@ManyToOne
sinhvien sinhvien;
public String getMahp() {
	return mahp;
}
public void setMahp(String mahp) {
	this.mahp = mahp;
}
public float getDiemhp() {
	return diemhp;
}
public void setDiemhp(float diemhp) {
	this.diemhp = diemhp;
}
public sinhvien getSinhvien() {
	return sinhvien;
}
public void setSinhvien(sinhvien sinhvien) {
	this.sinhvien = sinhvien;
}
public diemhp(String mahp, float diemhp, com.example.buoi88.model.sinhvien sinhvien) {
	super();
	this.mahp = mahp;
	this.diemhp = diemhp;
	this.sinhvien = sinhvien;
}
public diemhp() {
	super();
	// TODO Auto-generated constructor stub
}

}
