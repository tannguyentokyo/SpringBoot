package com.example.buoi81.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {
@RequestMapping("/a")//lấy tất cả
public int tinhTong() {
	return 1+2;
}
}