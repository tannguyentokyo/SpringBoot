package com.example.buoi83.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//tạo 1 class sách gồm mã sách,  tên sách, tên tác giả,đơn giá
//1.thực hiện thêm sửa xóa 1 quyển sách
//2. sắp xếp các quyển sách tăng dần
//3 tìm quyển sách có đơn giá cao nhất
//4 tìm kiếm 1 quyển sách
@Entity
@Table(name = "sach")
public class sach {
@Id
@Column(name = "masach")
String masach;
@Column(name = "tensach")
String tensach;
@Column(name = "tentg")
String tentg;
@Column(name = "dongia")
int dongia;
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
public String getTentg() {
	return tentg;
}
public void setTentg(String tentg) {
	this.tentg = tentg;
}
public int getDongia() {
	return dongia;
}
public void setDongia(int dongia) {
	this.dongia = dongia;
}
public sach() {
	super();
	// TODO Auto-generated constructor stub
}

}
