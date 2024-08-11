package com.example.buoi85.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "dongxe")
public class dongxe {
@Id
@Column(name = "DongXe")
String dongxe;
@Column(name = "HangXe")
String hangxe;
@Column(name = "SoChoNguoi")
int songuoi;
@JsonBackReference
@OneToMany(mappedBy = "dongxe")
List<dangkycungcap>dangkycungcaps;
public String getDongxe() {
	return dongxe;
}
public void setDongxe(String dongxe) {
	this.dongxe = dongxe;
}
public String getHangxe() {
	return hangxe;
}
public void setHangxe(String hangxe) {
	this.hangxe = hangxe;
}
public int getSonguoi() {
	return songuoi;
}
public void setSonguoi(int songuoi) {
	this.songuoi = songuoi;
}
public List<dangkycungcap> getDangkycungcaps() {
	return dangkycungcaps;
}
public void setDangkycungcaps(List<dangkycungcap> dangkycungcaps) {
	this.dangkycungcaps = dangkycungcaps;
}
public dongxe(String dongxe, String hangxe, int songuoi, List<dangkycungcap> dangkycungcaps) {
	super();
	this.dongxe = dongxe;
	this.hangxe = hangxe;
	this.songuoi = songuoi;
	this.dangkycungcaps = dangkycungcaps;
}
public dongxe() {
	super();
	// TODO Auto-generated constructor stub
}

}
