package com.example.buoi84.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "sanpham")
public class sanpham {
@Id
@Column(name = "masanpham")
String masp;
@Column(name = "tensanpham")
String tensp;
@Column(name = "soluong")
int soluong;
@Column(name = "xuatxu")
String xuatxu;
@JsonBackReference
@OneToMany(mappedBy = "sanpham")
List<khachhang>khachhangs;
public String getMasp() {
	return masp;
}
public void setMasp(String masp) {
	this.masp = masp;
}
public String getTensp() {
	return tensp;
}
public void setTensp(String tensp) {
	this.tensp = tensp;
}
public int getSoluong() {
	return soluong;
}
public void setSoluong(int soluong) {
	this.soluong = soluong;
}
public String getXuatxu() {
	return xuatxu;
}
public void setXuatxu(String xuatxu) {
	this.xuatxu = xuatxu;
}
public List<khachhang> getKhachhangs() {
	return khachhangs;
}
public void setKhachhangs(List<khachhang> khachhangs) {
	this.khachhangs = khachhangs;
}
public sanpham(String masp, String tensp, int soluong, String xuatxu, List<khachhang> khachhangs) {
	super();
	this.masp = masp;
	this.tensp = tensp;
	this.soluong = soluong;
	this.xuatxu = xuatxu;
	this.khachhangs = khachhangs;
}
public sanpham() {
	super();
	// TODO Auto-generated constructor stub
}

}
