package com.example.buoi82.cotroller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.buoi82.model.congty;
import com.example.buoi82.service.congtyService;

@RestController
public class congtyController {
@Autowired 
congtyService CongtyService;

//hiển thị công ty
@GetMapping("/thongtincongty")
ArrayList<congty>listcongtyController(){
	return CongtyService.listcongtyService();
}

//thêm công ty
@PostMapping("/themcongty")
String themcongtyController(@RequestParam("mã công ty")String macty,@RequestParam("tên công ty")String tencty) {
	CongtyService.themcongtyService(macty, tencty);
	return "thêm công ty thành công";
}

//sửa công ty
@PutMapping("/suacongty")
String suacongtyController(@RequestParam("mã công ty")String macty,@RequestParam("tên công ty")String tencty) {
	CongtyService.suacongtyService(macty, tencty);
	return "sửa thông tin cty "+macty+" thành công";
}

//xóa công ty
@DeleteMapping("/xoacongty")
String xoacongtyController(@RequestParam("mã công ty")String macty) {
	CongtyService.xoacongtyService(macty);
	return "xóa thông tin cty "+macty+" thành công"; 
}
}
