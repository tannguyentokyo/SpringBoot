package com.example.buoi85.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.buoi85.model.dangkycungcap;

import com.example.buoi85.repository.dangkycungcapRepository;

@Service
public class dangkycungcapService {
@Autowired
dangkycungcapRepository DangkycungcapRepository;

//hiển thị thông tin đăng ký cung cấp
public ArrayList<dangkycungcap>listdangkycungcapService(){
	return DangkycungcapRepository.listdangkycungcapRepository();
}

//Câu 3
	//Liệt kê thông tin của các nhà cung cấp đã từng đăng ký cung cấp những dòng xe
	//thuộc hãng xe “Toyota” với mức phí có đơn giá là 10.000  hoặc những dòng xe
	//thuộc hãng xe “KIA” với mức phí có đơn giá là 15.000 
public ArrayList<dangkycungcap>listnhacungcapcau3Service(){
	return DangkycungcapRepository.listnhacungcapcau3Repository();
}

//Câu 4
	//Liệt kê thông tin của các nhà cung cấp đã từng đăng ký cung cấp phương tiện
	//thuộc dòng xe “toyota” hoặc từng đăng ký cung cấp phương tiện thuộc dòng xe “KIA”
public ArrayList<dangkycungcap>listnhacungcapcau4Service(){
	return DangkycungcapRepository.listnhacungcapcau4Repository();
}

//Câu 5s. Liệt kê thông tin của các nhà cung cấp đã từng đăng ký cung cấp với mức phí có đơn giá là 15.000
public ArrayList<dangkycungcap>listnhacungcapcau5Service(){
	return DangkycungcapRepository.listnhacungcapcau5Repository();
}

//Câu 6. Hiển thị nhà cung cấp đã đăng kí những dịch vụ nào
public ArrayList<dangkycungcap>listnhacungcapcau6Service(){
	return DangkycungcapRepository.listnhacungcapcau6Repository();
}

//Câu 7. Hiển thị nhà cung cấp có số lượng xe lớn hơn 5
public ArrayList<dangkycungcap>listnhacungcapcau7Service(){
	return DangkycungcapRepository.listnhacungcapcau7Repository();
}

//Câu 8 Hiển thị dòng xe có đơn giá lớn hơn 10000
public ArrayList<dangkycungcap>listdongxecau8Service(){
	return DangkycungcapRepository.listdongxecau8Repository();
}
}
