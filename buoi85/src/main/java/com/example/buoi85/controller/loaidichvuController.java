package com.example.buoi85.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.buoi85.model.loaidichvu;
import com.example.buoi85.service.loaidichvuService;

@RestController
public class loaidichvuController {
@Autowired
loaidichvuService LoaidichvuService;

//hiển thị thông tin loại dịch vụ
@GetMapping("/loaidichvu")
ArrayList<loaidichvu>listloaidichvuController(){
	return LoaidichvuService.listloaidichvuRepository();
}





}
