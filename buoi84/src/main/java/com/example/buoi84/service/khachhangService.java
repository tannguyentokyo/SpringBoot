package com.example.buoi84.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.buoi84.model.khachhang;
import com.example.buoi84.repository.khachhangReposiotry;

@Service
public class khachhangService {
@Autowired
khachhangReposiotry KhachhangReposiotry;

//hiển thị
public ArrayList<khachhang>listkhService(){
	return KhachhangReposiotry.listkhRepository();
}

//check mã khách hàng
public boolean checkkh(String makh) {
	ArrayList<khachhang>list=KhachhangReposiotry.listkhRepository();
	int kt=0;
	for(khachhang i:list) {
		if(i.getMakh().equals(makh)) {
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

//thêm khách hàng
public void themkhService(String makh,String tenkh,String email,String diachi,int sdt,String masp) {
	KhachhangReposiotry.themkhRepository(makh, tenkh, diachi, email, sdt, masp);
}


//hiển thị khách hàng đã mua những sản phẩm nào
public ArrayList<khachhang>listkhspService(){
	return KhachhangReposiotry.listkhspRepository();
}

//hiển thị khách hàng đã mua những sản phẩm trên 20
public ArrayList<khachhang>listkhsp20Service(){
	return KhachhangReposiotry.listkhsp20Repository();
}

//hiển thị khách hàng đã mua những sản phẩm, xếp theo số lượng giảm dần
public ArrayList<khachhang>listkhspgiamdanService(){
	return KhachhangReposiotry.listkhspgiamdanRepository();
}

//tìm kiếm theo tên khách hàng 
public ArrayList<khachhang>timkhService(String ten){
	return KhachhangReposiotry.timkhRepository(ten);
}

//tìm kiếm theo tên sản phẩm
public ArrayList<khachhang>timspService(String ten){
	return KhachhangReposiotry.timspRepository(ten);
}


}
