package com.example.buoi90.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sachmuon")
public class sachmuon {
@Id
@Column(name = "masach")
String masach;
@Column(name = "tensach")
String tensach;
@Column(name = "tacgia")
String tacgia;
@Column(name = "soluong")
int soluong;
public String getMasach() {
	return masach;
}
public void setMasach(String masach) {
	this.masach = masach;
}
public String getTensach() {
	return tensach;
}
public void setTensach(String tensach) {
	this.tensach = tensach;
}
public String getTacgia() {
	return tacgia;
}
public void setTacgia(String tacgia) {
	this.tacgia = tacgia;
}
public int getSoluong() {
	return soluong;
}
public void setSoluong(int soluong) {
	this.soluong = soluong;
}
public sachmuon(String masach, String tensach, String tacgia, int soluong) {
	super();
	this.masach = masach;
	this.tensach = tensach;
	this.tacgia = tacgia;
	this.soluong = soluong;
}
public sachmuon() {
	super();
	// TODO Auto-generated constructor stub
}

}
