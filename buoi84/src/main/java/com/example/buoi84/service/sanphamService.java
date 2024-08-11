package com.example.buoi84.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.buoi84.model.sanpham;
import com.example.buoi84.repository.sanphamRepository;

@Service
public class sanphamService {
@Autowired
sanphamRepository SanphamRepository;

//hiển thị sản phẩm
public ArrayList<sanpham>listspService(){
	return SanphamRepository.listspRepository();
}

//check mã sản phẩm
public boolean checksp(String masp) {
	ArrayList<sanpham>list=SanphamRepository.listspRepository();
	int kt=0;
	for(sanpham i:list) {
		if(i.getMasp().equals(masp)) {
			kt=1;
			break;
		}		
	}
	if(kt==1) {
		return true;
	}else {
		return false;
	}
}

//thêm sản phẩm
public void themspService(String masp,String tensp,String xuatsu,int soluong) {
	sanpham sanpham=new sanpham();
	sanpham.setMasp(masp);
	sanpham.setTensp(tensp);
	sanpham.setSoluong(soluong);
	sanpham.setXuatxu(xuatsu);
	SanphamRepository.save(sanpham);
}



}
