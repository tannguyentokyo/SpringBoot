package com.example.buoi81.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.buoi81.Service.nhanvienService;
import com.example.buoi81.model.User;
@RestController
public class nhanvienController {
	@Autowired
	nhanvienService nhanvienService;
	@GetMapping("/listNhanVien")
	public ArrayList<User> listNV(){
		return nhanvienService.listNhanVien();
	}

}
