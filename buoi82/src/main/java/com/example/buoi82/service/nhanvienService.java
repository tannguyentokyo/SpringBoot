package com.example.buoi82.service;


import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.buoi82.model.nhanvien;
import com.example.buoi82.repository.nhanvienRepository;

@Service
public class nhanvienService {
@Autowired 
nhanvienRepository NhanvienRepository;

//thêm nhân viên mới
public void themnhanvienService(String manv,String ten,int tuoi,String diachi,String macty){
	NhanvienRepository.themnhanvienRepository(manv, ten, tuoi, diachi, macty);
}

//thêm nhân viên mới cách 2
public void themnhanvienService2(String manv,String ten,int tuoi,String diachi) {
	nhanvien mNhanvien=new nhanvien();
	mNhanvien.setManhanvien(manv);
	mNhanvien.setTennvS(ten);
	mNhanvien.setTuoi(tuoi);
	mNhanvien.setDiachi(diachi);
	NhanvienRepository.save(mNhanvien);
}

//hiển thị nhân viên
public ArrayList<nhanvien>listnhanvienService(){
	return NhanvienRepository.listnhanvienRepository();	
}

//hiển thị nhân viên trên 20
public ArrayList<nhanvien>listnhanvientren20Service(){
	return NhanvienRepository.listnhanvientren20Repository();
}
}
