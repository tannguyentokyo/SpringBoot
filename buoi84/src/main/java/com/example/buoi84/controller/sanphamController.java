package com.example.buoi84.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.buoi84.model.sanpham;
import com.example.buoi84.service.sanphamService;

//tạo 1 class sản phẩm gồm mã sản phẩm, tên sản phẩm, số lượng ,xuất sứ,số lượng
//tạo 1 class Khách hàng gồm mã khách hàng,tên khách hàng, email, số điện thoại, địa chỉ, mã sản phẩm

//1 thực hiện thêm, khách hàng và sản phẩm
//2 hiển thị những khách hàng nào đang mua những sản phẩm nào
//3 hiển thị các khách hàng nào nào mua số lượng lớn hơn 20
//4 hiển thị khách hàng đang mua sản phẩm nào sắp xếp theo giảm dần về số lượng
//5 tìm tên của 1 khách hàng nào đó đang mua những sản phẩm nào
//6 tìm kiếm tên 1 sản phẩm xem những khách hàng nào đang mua những sản phẩm đó


@RestController
public class sanphamController {
@Autowired 
sanphamService SanphamService;

//hiển thị sản phẩm
@GetMapping("/listsp")
ArrayList<sanpham>listspController(){
	return SanphamService.listspService();
}

//thêm sản phẩm
@PostMapping("/themsp")
String themspController(@RequestParam("masp")String masp,@RequestParam("tensp")String tensp,
		@RequestParam("xuatxu")String xs,@RequestParam("soluong")int soluong) {
	if(SanphamService.checksp(masp)==true) {
		return "mã sản phẩm "+masp+" đã tồn tại";
	}else {
		SanphamService.themspService(masp, tensp, xs, soluong);
		return "thêm mã sản phẩm "+masp+" thành công";
	}
}









}
