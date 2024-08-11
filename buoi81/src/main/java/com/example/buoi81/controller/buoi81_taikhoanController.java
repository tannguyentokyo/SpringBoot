package com.example.buoi81.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.buoi81.Service.buoi81_taikhoanService;
import com.example.buoi81.model.buoi81_taikhoan;

//Tạo 1 class tài khoản có các thuộc tính mã tài khoản tên tài khoản số tiền
//1 hiển thị thông tin tất cả tài khoản
//2 thêm tài khoản
//3 sửa thông tin tài khoản dựa vào mã tài khoản
//4 xoá tài khoản dựa vào mã tài khoản
//5 tìm kiếm tài khoản theo tên tài khoản
//6 hiển thị các tài khoản có số tiền >= 1000

@RestController
public class buoi81_taikhoanController {
@Autowired
buoi81_taikhoanService listTKService2;

//hiển thị thông tin tất cả tài khoản
@GetMapping("/taikhoan")
ArrayList<buoi81_taikhoan>ListTKController(){
	return listTKService2.listTKService();
}

//thêm tài khoản mới
@PostMapping("/themtaikhoan")
public String themController(@RequestParam("mã tài khoản")String matk,@RequestParam("tên tài khoản")String tentk,
		@RequestParam("số tiền")int sotien) {
	if(listTKService2.kiemtraID(matk)==true) {
		listTKService2.themService(matk, tentk, sotien);
		return "thêm tài khoản thành công";
	}else {
		return "tài khoản muốn thêm đã tồn tại";
	}
}

//sửa thông tin tài khoản
@PutMapping("/suataikhoan")
public String suaController(@RequestParam("mã tài khoản")String mtk,@RequestParam("tên tài khoản")String tentk,
		@RequestParam("số tiền")int sotien) {
	if(listTKService2.kiemtraID(mtk)==true) {
		return "tài khoản muốn sửa chưa tồn tại";
	}else {
		listTKService2.suaTKService(tentk, sotien, mtk);
		return "sửa tài khoản "+mtk+" thành công";
	}
}

//xóa tài khoản
@DeleteMapping("/xoatk")
public String xoaTKController(@RequestParam("mã tài khoản")String mtk) {
	if(listTKService2.kiemtraID(mtk)==true) {
		return "tài khoản muốn xóa ko tồn tại";
	}else {
		listTKService2.xoaTKService(mtk);
		return "xóa tài khoản "+mtk+" thành công";
	}
}


//tìm tài khoản theo tên
@GetMapping("/timtheoten")
public ArrayList<buoi81_taikhoan>timtheotenController(@RequestParam("tên")String ten){
	ArrayList<buoi81_taikhoan>list=listTKService2.timtheotenService(ten);
	return list;	
}

//6 hiển thị các tài khoản có số tiền >=1000	
	@GetMapping("/timtheosotien")
	public ArrayList<buoi81_taikhoan>listtheosotienController(){
		return listTKService2.listtheosotienService();
	}
	
	
	
	

}
