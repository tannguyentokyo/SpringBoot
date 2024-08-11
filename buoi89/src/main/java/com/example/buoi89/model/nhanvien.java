package com.example.buoi89.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "nhanvien")
public class nhanvien {
@Id
@Column(name = "manv")
String manv;
@Column(name = "ten")
String tennv;
@Column(name = "tuoi")
int tuoi;
@Column(name = "ngaysinh")
Date ngaysinh;
@Column(name = "vitricongviec")
int vitricongviec;
@Column(name = "songaylamviec")
float songaylamviec;
@Column(name = "luong")
double luong;
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
public int getTuoi() {
	return tuoi;
}
public void setTuoi(int tuoi) {
	this.tuoi = tuoi;
}
public Date getNgaysinh() {
	return ngaysinh;
}
public void setNgaysinh(Date ngaysinh) {
	this.ngaysinh = ngaysinh;
}
public int getVitricongviec() {
	return vitricongviec;
}
public void setVitricongviec(int vitricongviec) {
	this.vitricongviec = vitricongviec;
}
public float getSongaylamviec() {
	return songaylamviec;
}
public void setSongaylamviec(float songaylamviec) {
	this.songaylamviec = songaylamviec;
}
public double getLuong() {
	return luong;
}
public void setLuong(double luong) {
	this.luong = luong;
}
public nhanvien(String manv, String tennv, int tuoi, Date ngaysinh, int vitricongviec, float songaylamviec,
		double luong) {
	super();
	this.manv = manv;
	this.tennv = tennv;
	this.tuoi = tuoi;
	this.ngaysinh = ngaysinh;
	this.vitricongviec = vitricongviec;
	this.songaylamviec = songaylamviec;
	this.luong = luong;
}
public nhanvien() {
	super();
	// TODO Auto-generated constructor stub
}

}
