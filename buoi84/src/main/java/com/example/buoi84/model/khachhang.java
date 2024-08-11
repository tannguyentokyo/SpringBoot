package com.example.buoi84.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "khachhang")
public class khachhang {
@Id
@Column(name = "makhachhang")
String makh;
@Column(name = "tenkhachhang")
String tenkh;
@Column(name = "email")
String email;
@Column(name = "sdt")
int sdt;
@Column(name = "diachi")
String diachi;
@JoinColumn(name = "masanpham")
@ManyToOne
sanpham sanpham;
public String getMakh() {
	return makh;
}
public void setMakh(String makh) {
	this.makh = makh;
}
public String getTenkh() {
	return tenkh;
}
public void setTenkh(String tenkh) {
	this.tenkh = tenkh;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getSdt() {
	return sdt;
}
public void setSdt(int sdt) {
	this.sdt = sdt;
}
public String getDiachi() {
	return diachi;
}
public void setDiachi(String diachi) {
	this.diachi = diachi;
}
public sanpham getSanpham() {
	return sanpham;
}
public void setSanpham(sanpham sanpham) {
	this.sanpham = sanpham;
}
public khachhang(String makh, String tenkh, String email, int sdt, String diachi,
		com.example.buoi84.model.sanpham sanpham) {
	super();
	this.makh = makh;
	this.tenkh = tenkh;
	this.email = email;
	this.sdt = sdt;
	this.diachi = diachi;
	this.sanpham = sanpham;
}
public khachhang() {
	super();
	// TODO Auto-generated constructor stub
}

}
