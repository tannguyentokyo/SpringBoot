package com.example.buoi82.cotroller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {
	@RequestMapping("/a")
	public int tinhTong() {
		return 1+2;
	}
}
