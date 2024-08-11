package com.example.buoi83.controller;

import java.util.ArrayList;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.buoi83.model.sach;
import com.example.buoi83.service.sachService;



//tạo 1 class sách gồm mã sách,  tên sách, tên tác giả,đơn giá
//1.thực hiện thêm sửa xóa 1 quyển sách
//2. sắp xếp các quyển sách tăng dần theo giá
//3 tìm quyển sách có đơn giá cao nhất
//4 tìm kiếm 1 quyển sách
@RestController
public class sachController {
@Autowired
sachService SachService;

//hiển thị sách
@GetMapping("/list")
ArrayList<sach>listController(){
	return SachService.listService();
}

//thêm sách cách 1
@PostMapping("/them1")
String themController(@RequestParam("masach")String masasch,@RequestParam("tensach")String tensach,
		@RequestParam("tentg")String tentg,@RequestParam("dongia")int dongia) {
	if(SachService.check(masasch)==true) {
		return "mã sách "+masasch+" đã tồn tại";
	}else {
		SachService.themService(masasch, tensach, tentg, dongia);
		return "thêm "+masasch+" thành công";
	}
}

//thêm sách cách 2
@PostMapping("/them2")
String themController2(@RequestParam("masach")String masach,@RequestParam("tensach")String tensach,
		@RequestParam("tentg")String tentg,@RequestParam("dongia")int dongia) {
	if(SachService.check(masach)==true) {
		return "mã sách "+masach+" đã tồn tại";
	}else {
		SachService.themService2(masach, tensach, tentg, dongia);
		return "thêm mã sách "+masach+" thành công";
	}
}

//sửa sách
@PutMapping("/suasach")
String suaController(@RequestParam("masach")String masachaaa,@RequestParam("tensach")String tensach,
		@RequestParam("tentg")String tentg,@RequestParam("dongia")int dongia) {
	if(SachService.check(masachaaa)==true) {
		SachService.suaService(masachaaa, tensach, tentg, dongia);
		return "sửa "+masachaaa+" thành công";
	}else {
		return "mã sách " +masachaaa+" ko tồn tại";
	}
}

//xóa sách
@DeleteMapping("/xoasach")
String xoaController(@RequestParam("masach")String masach) {
	if(SachService.check(masach)==true) {
		SachService.xoaService(masach);
		return "xóa "+masach+" thành công";
	}else {
		return "mã sách " +masach+" ko tồn tại";
	}
}

//sắp xếp tăng dần theo đơn đơn giá cách 1
@GetMapping("/sapxeptangdan1")
ArrayList<sach>sapxeptangdanController(){
	ArrayList<sach>list=SachService.listService();
	for(int i=0;i<list.size();i++) {
		for(int j=i;j<list.size();j++) {
			if(list.get(i).getDongia()>list.get(j).getDongia()) {
				sach ktSach=list.get(i);
				list.set(i, list.get(j));
				list.set(j, ktSach);
			}
		}
	}
	return list;
}

//sắp xếp tăng dần theo đơn đơn giá cách 2
@GetMapping("/sapxeptangdan2")
ArrayList<sach>sapxeptangdanController2(){
	return SachService.sapxeptangdanService2();
}

//quyển sách có đơn giá cao nhất
@GetMapping("/giacaonhat")
ArrayList<sach>giacaonhatController(){
	ArrayList<sach>list=SachService.listService();
	int max=list.get(0).getDongia();
	for(sach i:list) {
		if(i.getDongia()>max) {
			max=i.getDongia();
		}
	}
	ArrayList<sach>giacaonhatArrayList=new ArrayList<sach>();
	for(sach i:list) {
		if(i.getDongia()==max) {
			giacaonhatArrayList.add(i);
		}
	}
	return giacaonhatArrayList;
}

//tìm theo mã
@GetMapping("/timtheoma")
sach timtheomaController(@RequestParam("masach")String ms) {
	return SachService.timtheomaService(ms);
}

//tìm theo tên
@GetMapping("/timtheoten")
ArrayList<sach>timtheotenController(@RequestParam("tensach")String ten){
	return SachService.timtheotenService(ten);
}






}
