package com.example.buoi86.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.buoi86.model.nhanvien;
import com.example.buoi86.repository.nhanvienRepository;

@Service
public class nhanvienService {
@Autowired 
nhanvienRepository NhanvienRepository;
	//hiển thị nhân viên
	public ArrayList<nhanvien>listnhanvienService(){
		return NhanvienRepository.listnhanvienRepository();
	}
	
	//hiển thị nhân viên lập trình web
	public ArrayList<nhanvien>listnhanvienwebService(){
		return NhanvienRepository.listnhanvienwebRepository();
	}
	
	//hiển thị nhân viên tuổi tăng dần
	public ArrayList<nhanvien>listnhanvientangdanService(){
		return NhanvienRepository.listnhanvientangdanRepository();
	}
	
	//hiển thị nhân viên trên 23 tuổi
	public ArrayList<nhanvien>listnhanvientren23Service(){
		return NhanvienRepository.listnhanvientren23Repository();
	}
	
	//hiển thị nhân viên quê ở huế
	public ArrayList<nhanvien>listnhanvienhueService(){
		return NhanvienRepository.listnhanvienhueRepository();
	}
}
