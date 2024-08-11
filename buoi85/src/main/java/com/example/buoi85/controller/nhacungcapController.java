package com.example.buoi85.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.buoi85.model.nhacungcap;
import com.example.buoi85.service.nhacungcapService;

@RestController
public class nhacungcapController {
@Autowired 
nhacungcapService NhacungcapService;

//hiển thị thông tin nhà cung cấp
@GetMapping("/nhacungcap")
ArrayList<nhacungcap>listnhacungcapController(){
	return NhacungcapService.listnhacungcapService();
}



}
