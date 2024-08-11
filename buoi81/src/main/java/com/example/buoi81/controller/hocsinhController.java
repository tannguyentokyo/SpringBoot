package com.example.buoi81.controller;

import java.util.ArrayList;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.buoi81.Service.hocsinhService;
import com.example.buoi81.model.HocSinh;

//lấy tất cả người dùng
//hiển thị tất cả các người dùng có tuổi lớn hơn 20 tuổi
//Sắp xếp tăng dần theo tuôi
//Tìm kiếm tên của người dùng nguyen van a
//tìm kiếm người dùng theo tên
//Tìm các nhân viên có tuổi lớn hơn 25 hoặc có tên A
//thêm học sinh mới
//xóa học sinh
@RestController
public class hocsinhController {
@Autowired
hocsinhService hocsinhService123;

//lấy tất cả người dùng
@GetMapping("/DanhSachHocSinh")
ArrayList<HocSinh>listHS(){
	return hocsinhService123.listHS();
}

//hiển thị tất cả các người dùng có tuổi lớn hơn 20 tuổi
@GetMapping("/hocsinhtren20")
ArrayList<HocSinh>listtren20(){
	return hocsinhService123.listHS20();
}

//Sắp xếp tăng dần theo tuôi
@GetMapping("/sapxeptuoi")
ArrayList<HocSinh>sapxeptangdan(){
	return hocsinhService123.sapxeptuoi();
}

//Tìm kiếm tên của người dùng nguyen van a
@GetMapping("/timNguyenVanA")
ArrayList<HocSinh>timNGuyenVanA(){
	return hocsinhService123.TimNguyenvana();
}

//tìm kiếm theo tên người dùng
@GetMapping("/timkiem")
ArrayList<HocSinh>timkiem(@RequestParam("TenPostMan")String TenSpringBoot1){
	return hocsinhService123.timkiemTen(TenSpringBoot1);
}

//Tìm các nhân viên có tuổi lớn hơn 25 hoặc có tên theo tìm kiếm
@GetMapping("/timkiem2")
ArrayList<HocSinh>timkiems2(@RequestParam("TenPostMan2")String ten){
	return hocsinhService123.Tim2(ten);
}

//thêm học sinh mới
@PostMapping("/them")   //thêm, sửa 
public String them(@RequestParam("ma")String mahs,@RequestParam("ten")String tenhs,@RequestParam("tuoi")int tuoi
		,@RequestParam("diachi")String diachi){
	if(hocsinhService123.kiemtraID(mahs)==true) {
		hocsinhService123.Them(mahs, tenhs, tuoi, diachi);
	return "thêm thành công";
}else {
	return "thêm thất bại do đã trùng mã học sinh";
}
}

//xóa học sinh
@DeleteMapping("/xoa") //xóa
public String xoa(@RequestParam("ma")String mahs) {
	if(hocsinhService123.kiemtraID(mahs)==false) {
		hocsinhService123.Xoa(mahs);
		return "xóa thành công";
	}else {
		return"xóa thất bại vì mã học sinh ko tồn tại";
	}
}


}