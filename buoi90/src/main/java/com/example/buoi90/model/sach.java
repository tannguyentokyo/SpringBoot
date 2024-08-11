package com.example.buoi90.model;
//Quản lý sách trong thư viện:
//Tạo một lớp sách để đại diện cho thông tin của một quyển sách 
//với các thuộc tính như mã sách, tên sách, tác giả, số lượng tồn kho
//Nhập n quyển sách
//sửa sách
//xóa sách
//sắp xếp giảm dần theo số lượng kho
//Xử lý việc mượn sách
//Xử lý việc  trả sách
//xem số lượng tồn kho còn lại là bao nhiêu

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sach")
public class sach {
@Id
@Column(name = "masach")
String masach;
@Column(name = "tensach")
String tensach;
@Column(name = "tacgia")
String tacgia;
@Column(name = "soluongtonkho")
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
public sach(String masach, String tensach, String tacgia, int soluong) {
	super();
	this.masach = masach;
	this.tensach = tensach;
	this.tacgia = tacgia;
	this.soluong = soluong;
}
public sach() {
	super();
	// TODO Auto-generated constructor stub
}

}
