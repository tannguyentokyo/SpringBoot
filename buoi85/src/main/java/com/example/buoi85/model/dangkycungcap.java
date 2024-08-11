package com.example.buoi85.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "dangkycungcap")
public class dangkycungcap {
@Id
@Column(name = "MaDangKyCungCap")
String madkcungcap;
@JoinColumn(name = "MaNhaCungCap")
@ManyToOne
nhacungcap nhacungcap;
@JoinColumn(name = "MaLoaiDichVu")
@ManyToOne
loaidichvu loaidichvu;
@JoinColumn(name = "DongXe")
@ManyToOne
dongxe dongxe;
@JoinColumn(name = "MaMucPhi")
@ManyToOne
mucphi mucphi;
@Column(name = "NgayBatDau")
Date ngaybatdauDate;
@Column(name = "NgayKetThuc")
Date ngayketthucDate;
@Column(name = "SoLuongXeDangKy")
int soluongxe;
public String getMadkcungcap() {
	return madkcungcap;
}
public void setMadkcungcap(String madkcungcap) {
	this.madkcungcap = madkcungcap;
}
public nhacungcap getNhacungcap() {
	return nhacungcap;
}
public void setNhacungcap(nhacungcap nhacungcap) {
	this.nhacungcap = nhacungcap;
}
public loaidichvu getLoaidichvu() {
	return loaidichvu;
}
public void setLoaidichvu(loaidichvu loaidichvu) {
	this.loaidichvu = loaidichvu;
}
public dongxe getDongxe() {
	return dongxe;
}
public void setDongxe(dongxe dongxe) {
	this.dongxe = dongxe;
}
public mucphi getMucphi() {
	return mucphi;
}
public void setMucphi(mucphi mucphi) {
	this.mucphi = mucphi;
}
public Date getNgaybatdauDate() {
	return ngaybatdauDate;
}
public void setNgaybatdauDate(Date ngaybatdauDate) {
	this.ngaybatdauDate = ngaybatdauDate;
}
public Date getNgayketthucDate() {
	return ngayketthucDate;
}
public void setNgayketthucDate(Date ngayketthucDate) {
	this.ngayketthucDate = ngayketthucDate;
}
public int getSoluongxe() {
	return soluongxe;
}
public void setSoluongxe(int soluongxe) {
	this.soluongxe = soluongxe;
}
public dangkycungcap(String madkcungcap, com.example.buoi85.model.nhacungcap nhacungcap,
		com.example.buoi85.model.loaidichvu loaidichvu, com.example.buoi85.model.dongxe dongxe,
		com.example.buoi85.model.mucphi mucphi, Date ngaybatdauDate, Date ngayketthucDate, int soluongxe) {
	super();
	this.madkcungcap = madkcungcap;
	this.nhacungcap = nhacungcap;
	this.loaidichvu = loaidichvu;
	this.dongxe = dongxe;
	this.mucphi = mucphi;
	this.ngaybatdauDate = ngaybatdauDate;
	this.ngayketthucDate = ngayketthucDate;
	this.soluongxe = soluongxe;
}
public dangkycungcap() {
	super();
	// TODO Auto-generated constructor stub
}

}
