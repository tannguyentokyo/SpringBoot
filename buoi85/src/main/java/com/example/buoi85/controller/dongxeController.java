package com.example.buoi85.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.buoi85.model.dongxe;
import com.example.buoi85.service.dongxeService;

@RestController
public class dongxeController {
@Autowired
dongxeService DongxeService;

//hiển thị thông tin dòng xe
@GetMapping("/dongxe")
ArrayList<dongxe>listdongxeController(){
	return DongxeService.listdongxeService();
}

//Câu 2
//Liệt kê những dòng xe có số chỗ ngồi trên 5 chỗ

@GetMapping("/dongxetren5")
ArrayList<dongxe> listdongxetren5Controller() {
	return DongxeService.listdongxetren5Service();
}




}
