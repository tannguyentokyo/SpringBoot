package com.example.buoi85.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.buoi85.model.dangkycungcap;

import com.example.buoi85.service.dangkycungcapService;
import com.example.buoi85.service.nhacungcapService;

//Câu 1. Nhập dự liệu ở trên
//Câu 2
//Liệt kê những dòng xe có số chỗ ngồi trên 5 chỗ
//Câu 3
//Liệt kê thông tin của các nhà cung cấp đã từng đăng ký cung cấp những dòng xe
//thuộc hãng xe “Toyota” với mức phí có đơn giá là 10.000  hoặc những dòng xe
//thuộc hãng xe “KIA” với mức phí có đơn giá là 15.000 
//Câu 4
//Liệt kê thông tin của các nhà cung cấp đã từng đăng ký cung cấp phương tiện
//thuộc dòng xe “toyota” hoặc từng đăng ký cung cấp phương tiện thuộc dòng xe “KIA”
//Câu 5s. Liệt kê thông tin của các nhà cung cấp đã từng đăng ký cung cấp với mức phí có đơn giá là 15.000
//Câu 6. Hiển thị nhà cung cấp đã đăng kí những dịch vụ nào
//Câu 7. Hiển thị nhà cung cấp có số lượng xe lớn hơn 5
//Câu 8 Hiển thị dòng xe có đơn giá lớn hơn 10000

@RestController
public class dangkycungcapController {
@Autowired
dangkycungcapService DangkycungcapService;

@Autowired
nhacungcapService NhacungcapService;
//hiển thị thông tin đăng ký cung cấp
@GetMapping("/dangkycungcap")
ArrayList<dangkycungcap>listdangkycungcapController(){
	return DangkycungcapService.listdangkycungcapService();
}


//Câu 3
	//Liệt kê thông tin của các nhà cung cấp đã từng đăng ký cung cấp những dòng xe
	//thuộc hãng xe “Toyota” với mức phí có đơn giá là 10.000  hoặc những dòng xe
	//thuộc hãng xe “KIA” với mức phí có đơn giá là 15.000 
@GetMapping("/cau3")
ArrayList<dangkycungcap>listnhacungcapcau3Controller(){
	return DangkycungcapService.listnhacungcapcau3Service();
}

//Câu 4
	//Liệt kê thông tin của các nhà cung cấp đã từng đăng ký cung cấp phương tiện
	//thuộc dòng xe “toyota” hoặc từng đăng ký cung cấp phương tiện thuộc dòng xe “KIA”
@GetMapping("/cau4")
ArrayList<dangkycungcap>listnhacungcapcau4Controller(){
	return DangkycungcapService.listnhacungcapcau4Service();
}

//Câu 5s. Liệt kê thông tin của các nhà cung cấp đã từng đăng ký cung cấp với mức phí có đơn giá là 15.000
@GetMapping("/cau5")
ArrayList<dangkycungcap>listnhacungcapcau5Controller(){
	return DangkycungcapService.listnhacungcapcau5Service();
}

//Câu 6. Hiển thị nhà cung cấp đã đăng kí những dịch vụ nào
@GetMapping("/cau6")
ArrayList<dangkycungcap>listnhacungcapcau6Controller(){
	return DangkycungcapService.listnhacungcapcau6Service();
}

//Câu 7. Hiển thị nhà cung cấp có số lượng xe lớn hơn 5
@GetMapping("/cau7")
ArrayList<dangkycungcap>listnhacungcapcau7Controller(){
	return DangkycungcapService.listnhacungcapcau7Service();
}

//Câu 8 Hiển thị dòng xe có đơn giá lớn hơn 10000
@GetMapping("/cau8")
ArrayList<dangkycungcap>listdongxecau8Controller(){
	return DangkycungcapService.listdongxecau8Service();
}

}
