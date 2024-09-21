package com.example.spring_demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class test {
	@RequestMapping("/a")
	public int tinhTong() {
		return 1+2+5+12;
	}
}
