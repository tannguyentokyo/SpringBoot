package com.example.buoi85.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "loaidichvu")
public class loaidichvu {
@Id
@Column(name = "MaLoaiDichVu")
String maloaidv;
@Column(name = "TenLoaiDichVu")
String tenloaidv;
@JsonBackReference
@OneToMany(mappedBy = "loaidichvu")
List<dangkycungcap>dangkycungcaps;
public String getMaloaidv() {
	return maloaidv;
}
public void setMaloaidv(String maloaidv) {
	this.maloaidv = maloaidv;
}
public String getTenloaidv() {
	return tenloaidv;
}
public void setTenloaidv(String tenloaidv) {
	this.tenloaidv = tenloaidv;
}
public List<dangkycungcap> getDangkycungcaps() {
	return dangkycungcaps;
}
public void setDangkycungcaps(List<dangkycungcap> dangkycungcaps) {
	this.dangkycungcaps = dangkycungcaps;
}
public loaidichvu(String maloaidv, String tenloaidv, List<dangkycungcap> dangkycungcaps) {
	super();
	this.maloaidv = maloaidv;
	this.tenloaidv = tenloaidv;
	this.dangkycungcaps = dangkycungcaps;
}
public loaidichvu() {
	super();
	// TODO Auto-generated constructor stub
}

}
