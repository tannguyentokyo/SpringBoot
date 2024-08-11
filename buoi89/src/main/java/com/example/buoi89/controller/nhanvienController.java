package com.example.buoi89.controller;

import java.sql.Date;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.buoi89.model.nhanvien;
import com.example.buoi89.service.nhanvienService;


@RestController
public class nhanvienController {
	
//	cách tính lương vị trí công việc 
//	nếu vị trí công việc 1 sẽ là 500 1 ngày, 
//	vị trí công việc 2 sẽ là 1000 ngày 
//	vị trí công việc 3 sẽ là 1500 ngày
//	Tạo một lớp Nhân Viên để đại diện cho thông tin của một nhân viên như 
//	mã nhân viên,tên, tuổi, ngày sinh, vị trí công việc, sô ngày làm việc,lương
//
//	1 nhập n nhân viên
//	2.in tất cả thông tin nhân viên
//	3 sắp xếp lương tăng dần
//	4 sửa vị trí công việc cho nhân viên dựa vào mã nhân viên
//	5 xóa nhân viên
	
@Autowired
nhanvienService NhanvienService;

//hiển thị thông tin nhân viên
@GetMapping("/listnv")
ArrayList<nhanvien>listnvController(){
	return NhanvienService.listnvService();
}

//thêm nhân viên cách 1
@PostMapping("/themnvcach1")
String themnvcach1Controller(@RequestParam("manv")String manv,
	@RequestParam("ten")String ten,@RequestParam("tuoi")int tuoi,
	@RequestParam("ngaysinh")Date ngaysinh,@RequestParam("vitri")int vitri,
	@RequestParam("songay")float songay) {
	int kt=0;
	if(NhanvienService.check(manv)==false) {
		kt=1;	
	}
	if(kt==1) {
		if(vitri!=1&&vitri!=2&&vitri!=3) {
			return "vị trí công việc nhập sai";
		}else {
			double luong=0;
			if(vitri==1) {
				luong=songay*500;
			}else if (vitri==2) {
				luong=songay*1000;
			}else {
				luong=songay*1500;
			}
			NhanvienService.themnvcach1Service(manv, ten, tuoi, ngaysinh, vitri, songay, luong);
			return "thêm nhân viên thành công";
		}
	}else {
		return "mã nhân viên đã tồn tại";
	}
}

//thêm nhân viên cách 2
@PostMapping("/themnvcach2")
String themnvcach2Controller(@RequestParam("manv")String manv,
	@RequestParam("ten")String ten,@RequestParam("tuoi")int tuoi,
	@RequestParam("ngaysinh")Date ngaysinh,@RequestParam("vitri")int vitri,
	@RequestParam("songay")float songay) {
	int kt=0;
	if(NhanvienService.check(manv)==false) {
		kt=1;	
	}
	if(kt==1) {
		if(vitri!=1&&vitri!=2&&vitri!=3) {
			return "vị trí công việc nhập sai";
		}else {
			double luong=0;
			if(vitri==1) {
				luong=songay*500;
			}else if (vitri==2) {
				luong=songay*1000;
			}else {
				luong=songay*1500;
			}
			NhanvienService.themnvcach2Service(manv, ten, tuoi, ngaysinh, vitri, songay, luong);
			return "thêm nhân viên thành công";
		}
	}else {
		return "mã nhân viên đã tồn tại";
	}
}

//sắp xếp nhân viên theo lương tăng dần
@GetMapping("/listtangdan")
ArrayList<nhanvien>listtangdanController(){
	return NhanvienService.listtangdanService();
}

//4 sửa vị trí công việc cho nhân viên dựa vào mã nhân viên
@PutMapping("/suavitri")
String suavitriController(@RequestParam("manv")String manv,
		@RequestParam("vitri")int vitri) {
	int kt=0;
	float songay=0;
	ArrayList<nhanvien>list=NhanvienService.listnvService();
	if(NhanvienService.check(manv)==true) {
		for(nhanvien i:list) {
			if(i.getManv().equals(manv)) {
				songay=i.getSongaylamviec();
			}
		}
		kt=1;
	}
	if(kt==1) {
		if(vitri<1||vitri>3) {
			return "nhập vị trí công việc sai, vui lòng nhập từ 1 đến 3";
		}else {
			double luong=0;
			if(vitri==1) {
				luong=songay*500;
			}else if (vitri==2) {
				luong=songay*1000;
			}else {
				luong=songay*1500;
			}
			NhanvienService.suavitriService(manv, luong, vitri);
			return "sửa vị trí công việc nhân viên: "+manv+" thành công";
		}
	}else {
		return "mã nhân viên " +manv+" ko tồn tại";
	}
}


//5 xóa nhân viên
@DeleteMapping("/xoanhanvien")
String xoanhanvienController(@RequestParam("manv")String manv) {
	if(NhanvienService.check(manv)==true) {
		NhanvienService.xoanhanvienService(manv);
		return "xóa nhân viên "+manv+" thành công";
	}else {
		return "nhân viên "+manv+" ko tồn tại";
	}
}


}
