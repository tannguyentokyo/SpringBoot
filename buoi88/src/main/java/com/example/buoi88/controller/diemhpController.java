package com.example.buoi88.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.buoi88.model.diemhp;

import com.example.buoi88.service.diemhpService;
//Nhập dữ liệu
//Hiển thị các sinh viên có điểm học phần lớn hơn 8
//Hiển thị các sinh viên sắp xếp tăng dần theo điểm học phần
//Tìm kiếm 1 sinh viên xem được điểm
//sửa 1 sinh viên

@RestController
public class diemhpController {
@Autowired
diemhpService DiemHPService;
//hiển thị thông tin điểm học phần
@GetMapping("/list")
ArrayList<diemhp> listdiemHPController(){
	return DiemHPService.listdiemHPService(); 
}

//Hiển thị các sinh viên có điểm học phần lớn hơn 8
@GetMapping("/listtren8")
ArrayList<diemhp>listtren8Controller(){
	return DiemHPService.listtren8Service();
}

//Hiển thị các sinh viên sắp xếp tăng dần theo điểm học phần
@GetMapping("/listtangdan")
ArrayList<diemhp>listtangdanController(){
	return DiemHPService.listtangdanService();
}

//tìm kiếm 1 sinh viên xem được điểm
@GetMapping("/timsinhvien")
ArrayList<diemhp>listsinhvienController(@RequestParam("tên")String tensv){
	return DiemHPService.timsinhvienService(tensv);
}

//sửa điểm sinh viên theo mã sinh viên
@PutMapping("/suadiem")
String suadiemController(
		@RequestParam("masv")String masv,@RequestParam("diem")float diemmoi) {
	if(DiemHPService.check(masv)==true) {
		DiemHPService.suadiemService(masv, diemmoi);
		return "sửa điểm "+masv+" thành công";
	}else {
		return "mã sinh viên "+masv+" ko tồn tại";
	}
}

}
