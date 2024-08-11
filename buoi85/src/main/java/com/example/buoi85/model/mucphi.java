package com.example.buoi85.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "mucphi")
public class mucphi {
@Id
@Column(name = "MaMucPhi")
String mamucphi;
@Column(name = "DonGia")
int dongia;
@Column(name = "MoTa")
String mota;
@JsonBackReference
@OneToMany(mappedBy = "mucphi")
List<dangkycungcap>dangkycungcaps;
public String getMamucphi() {
	return mamucphi;
}
public void setMamucphi(String mamucphi) {
	this.mamucphi = mamucphi;
}
public int getDongia() {
	return dongia;
}
public void setDongia(int dongia) {
	this.dongia = dongia;
}
public String getMota() {
	return mota;
}
public void setMota(String mota) {
	this.mota = mota;
}
public List<dangkycungcap> getDangkycungcaps() {
	return dangkycungcaps;
}
public void setDangkycungcaps(List<dangkycungcap> dangkycungcaps) {
	this.dangkycungcaps = dangkycungcaps;
}
public mucphi(String mamucphi, int dongia, String mota, List<dangkycungcap> dangkycungcaps) {
	super();
	this.mamucphi = mamucphi;
	this.dongia = dongia;
	this.mota = mota;
	this.dangkycungcaps = dangkycungcaps;
}
public mucphi() {
	super();
	// TODO Auto-generated constructor stub
}

}
