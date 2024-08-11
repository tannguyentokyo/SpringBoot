package com.example.buoi83.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.buoi83.model.sach;
import com.example.buoi83.repository.sachRepository;

@Service
public class sachService {
@Autowired 
sachRepository SachRepository;

//hiển thị sách
public ArrayList<sach> listService(){
	return SachRepository.listRepository();	
}

//sắp xếp sách tăng dần theo đơn giá
public ArrayList<sach>sapxeptangdanService2() {
	return SachRepository.sapxeptangdanRepository2();
}

//check sách
public boolean check(String masach) {
	ArrayList<sach>listcheck=SachRepository.listRepository();
	int kt=0;
	for(sach i:listcheck) {
		if(i.getMasach().equals(masach)) {
			kt=1;
			break;		
		}
	}
	if(kt==0) {
		return false;
	}else {
		return true;
	}
}

//thêm sách cách 1
public void themService(String masach,String tensach,String tentg,int dongia) {
	SachRepository.themRepository(masach, tensach, tentg, dongia);
}

//thêm sách cách 2
public void themService2(String masach,String tensach,String tentg,int dongia) {
	sach themSach=new sach();
	themSach.setMasach(masach);
	themSach.setTensach(tensach);
	themSach.setTentg(tentg);
	themSach.setDongia(dongia);
	SachRepository.save(themSach);
}

//sửa sách
public void suaService(String masach,String tensach,String tentg,int dongia) {
	SachRepository.suaRepository(masach, tensach, tentg, dongia);
}

//xóa sách
public void xoaService(String masach) {
	SachRepository.xoaRepository(masach);
}

//tìm theo mã
public sach timtheomaService(String masach) {
	return SachRepository.timtheomaReposioty(masach);
}

//tìm theo tên
public ArrayList<sach>timtheotenService(String ten){
	return SachRepository.timtheotenRepository(ten);
}













}
