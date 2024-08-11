package com.example.buoi86.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.buoi86.model.nhanvien;
import com.example.buoi86.service.nhanvienService;

//-Nhập dữ liệu cho nhân viên
//
//--NHẬP NHÂN DỮ LIỆU CHO PHÒNG BAN
//
//--HIển thị nhân viên đang làm ở phòng ban nào
//
//--hiển thị nhân viên làm ở phòng ban lập trình web
//
//--SẮP XẾP TUỔI TĂNG DẦN CỦA NHÂN VIÊN
//
//--tìm nhân viên có tuổi lớn hơn 23
//--Hiển thị nhân viên có quên quán ở HUẾ

@RestController
public class nhanvienController {
@Autowired
nhanvienService NhanvienService;

//hiển thị thông tin nhân viên
@GetMapping("/listnhanvien")
ArrayList<nhanvien>listnhanvienController(){
	return NhanvienService.listnhanvienService();
}

//hiển thị nhân viên web
@GetMapping("/listnhanvienweb")
ArrayList<nhanvien>listnhanvienwebController(){
	return NhanvienService.listnhanvienwebService();
}

//hiển thị nhân viên tuổi tăng dần cách 1
@GetMapping("/listnhanvien1")
ArrayList<nhanvien>listnhanvientangdan1Controller(){
	return NhanvienService.listnhanvientangdanService();
}

//hiển thị nhân viên tuổi tăng dần cách 2
@GetMapping("/listnhanvien2")
ArrayList<nhanvien>listnhanvientangdan2Controller(){
	ArrayList<nhanvien>list=NhanvienService.listnhanvienService();
	for(int i=0;i<list.size();i++) {
		for(int j=i;j<list.size();j++) {
			if(list.get(i).getTuoinv()>list.get(j).getTuoinv()) {
				nhanvien ktNhanvien=list.get(i);
				list.set(i, list.get(j));
				list.set(j, ktNhanvien);
			}
		}
	}
	return list;
}

//hiển thị nhân viên trên 23 tuổi
@GetMapping("/listnhanvientren23")
ArrayList<nhanvien>listnhanvientren23Controller(){
	return NhanvienService.listnhanvientren23Service();
}

//hiển thị nhân viên quê ở huế
@GetMapping("/listnhanvienhue")
ArrayList<nhanvien>listnhanvienhueController(){
	return NhanvienService.listnhanvienhueService();
}

}
