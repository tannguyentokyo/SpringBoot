package com.example.buoi85.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.buoi85.model.mucphi;
import com.example.buoi85.service.mucphiService;

@RestController
public class mucphiController {
@Autowired
mucphiService MucphiService;

//hiển thị thông tin mức phí
@GetMapping("/mucphi")
ArrayList<mucphi>listmucphiController(){
	return MucphiService.listmucphiService();
}




}
