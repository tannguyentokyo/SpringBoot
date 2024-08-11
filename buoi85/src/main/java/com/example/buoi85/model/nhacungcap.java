package com.example.buoi85.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "nhacungcap")
public class nhacungcap {
@Id
@Column(name = "MaNhaCungCap")
String manhacungcap;
@Column(name = "TenNhaCungCap")
String tennhacungcao;
@Column(name = "DiaChi")
String diachi;
@Column(name = "SDT")
int sdt;
@Column(name = "MaSoThue")
int mst;
@JsonBackReference
@OneToMany(mappedBy = "nhacungcap")
List<dangkycungcap>dangkycungcaps;
public String getManhacungcap() {
	return manhacungcap;
}
public void setManhacungcap(String manhacungcap) {
	this.manhacungcap = manhacungcap;
}
public String getTennhacungcao() {
	return tennhacungcao;
}
public void setTennhacungcao(String tennhacungcao) {
	this.tennhacungcao = tennhacungcao;
}
public String getDiachi() {
	return diachi;
}
public void setDiachi(String diachi) {
	this.diachi = diachi;
}
public int getSdt() {
	return sdt;
}
public void setSdt(int sdt) {
	this.sdt = sdt;
}
public int getMst() {
	return mst;
}
public void setMst(int mst) {
	this.mst = mst;
}
public List<dangkycungcap> getDangkycungcaps() {
	return dangkycungcaps;
}
public void setDangkycungcaps(List<dangkycungcap> dangkycungcaps) {
	this.dangkycungcaps = dangkycungcaps;
}
public nhacungcap(String manhacungcap, String tennhacungcao, String diachi, int sdt, int mst,
		List<dangkycungcap> dangkycungcaps) {
	super();
	this.manhacungcap = manhacungcap;
	this.tennhacungcao = tennhacungcao;
	this.diachi = diachi;
	this.sdt = sdt;
	this.mst = mst;
	this.dangkycungcaps = dangkycungcaps;
}
public nhacungcap() {
	super();
	// TODO Auto-generated constructor stub
}

}
