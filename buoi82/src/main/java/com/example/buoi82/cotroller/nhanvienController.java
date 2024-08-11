package com.example.buoi82.cotroller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.buoi82.model.nhanvien;
import com.example.buoi82.service.nhanvienService;

@RestController
public class nhanvienController {
@Autowired
nhanvienService NhanvienService;

//thêm nhân viên
@PostMapping("/themnv")
public String themnhanvienController(@RequestParam("mã nhân viên")String manv,@RequestParam("tên")String ten,
		@RequestParam("tuổi")int tuoi,@RequestParam("địa chỉ")String diachi,@RequestParam("mã công ty")String macty) {
	NhanvienService.themnhanvienService(manv, ten, tuoi, diachi, macty);
	return "thêm nhân viên mới thành công";
}

//thêm nhân viên 2
@PostMapping("/themnv2")
public String themnhanvienController2(@RequestParam("mã nhân viên")String manv,@RequestParam("tên")String ten,
		@RequestParam("tuổi")int tuoi,@RequestParam("địa chỉ")String diachi) {
	NhanvienService.themnhanvienService2(manv, ten, tuoi, diachi);
	return "thêm nhân viên mới thành công";
}

//hiển thị nhân viên
@GetMapping("/listnv")
public ArrayList<nhanvien>listnhanvienController(){
	return NhanvienService.listnhanvienService();
}

//hiển thị nhân viên trên 20
@GetMapping("/listnvtren20")
public ArrayList<nhanvien>listnhanvientren20Controller(){
	return NhanvienService.listnhanvientren20Service();
}
}
