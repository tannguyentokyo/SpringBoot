package com.example.buoi88.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "sinhvien")
public class sinhvien {
@Id
@Column(name = "masv")
String masv;
@Column(name = "hoten")
String hoten;
@Column(name = "malop")
String malop;
@Column(name = "gioitinh")
String gioitinh;
@Column(name = "ngaysinh")
Date ngaysinh;
@Column(name = "diachi")
String diachi;
@JsonBackReference
@OneToMany(mappedBy = "sinhvien")
List<diemhp>diemHPs;
public String getMasv() {
	return masv;
}
public void setMasv(String masv) {
	this.masv = masv;
}
public String getHoten() {
	return hoten;
}
public void setHoten(String hoten) {
	this.hoten = hoten;
}
public String getMalop() {
	return malop;
}
public void setMalop(String malop) {
	this.malop = malop;
}
public String getGioitinh() {
	return gioitinh;
}
public void setGioitinh(String gioitinh) {
	this.gioitinh = gioitinh;
}
public Date getNgaysinh() {
	return ngaysinh;
}
public void setNgaysinh(Date ngaysinh) {
	this.ngaysinh = ngaysinh;
}
public String getDiachi() {
	return diachi;
}
public void setDiachi(String diachi) {
	this.diachi = diachi;
}
public List<diemhp> getDiemHPs() {
	return diemHPs;
}
public void setDiemHPs(List<diemhp> diemHPs) {
	this.diemHPs = diemHPs;
}
public sinhvien(String masv, String hoten, String malop, String gioitinh, Date ngaysinh, String diachi,
		List<diemhp> diemHPs) {
	super();
	this.masv = masv;
	this.hoten = hoten;
	this.malop = malop;
	this.gioitinh = gioitinh;
	this.ngaysinh = ngaysinh;
	this.diachi = diachi;
	this.diemHPs = diemHPs;
}
public sinhvien() {
	super();
	// TODO Auto-generated constructor stub
}

}
