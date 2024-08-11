package com.example.buoi82.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;



@Entity
@Table(name = "congty")
public class congty {
@Id
@Column(name = "Macongty")
String macongtyString;
@Column(name = "Tencongty")
String tencongtyString;
@JsonBackReference
@OneToMany(mappedBy = "congty")
java.util.List<nhanvien>nhanviens;

public String getMacongtyString() {
	return macongtyString;
}
public void setMacongtyString(String macongtyString) {
	this.macongtyString = macongtyString;
}
public String getTencongtyString() {
	return tencongtyString;
}
public void setTencongtyString(String tencongtyString) {
	this.tencongtyString = tencongtyString;
}
public java.util.List<nhanvien> getNhanviens() {
	return nhanviens;
}
public void setNhanviens(java.util.List<nhanvien> nhanviens) {
	this.nhanviens = nhanviens;
}
public congty() {
	super();
	// TODO Auto-generated constructor stub
}



}
