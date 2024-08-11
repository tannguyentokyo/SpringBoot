package com.example.buoi90.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.buoi90.model.sach;
import com.example.buoi90.repository.sachRepository;

@Service
public class sachService {
@Autowired
sachRepository SachRepository;

	//hiển thị toàn bộ thông tin sách
	public ArrayList<sach>listsachService(){
		return SachRepository.listsachRepository();
	}
	
	//check mã sách
	public boolean check(String masach) {
		ArrayList<sach>list=SachRepository.listsachRepository();
		int kt=0;
		for(sach i:list) {
			if(i.getMasach().equals(masach)==true) {
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
	
	
	//thêm sách cách 1
	public void themsach1Service(String masach,String tensach,String tacgia,int soluong) {
		SachRepository.themsach1Repository(masach, tensach, tacgia, soluong);
	}
	
	//thêm sách cách 2
	public void themsach2Service(String masach,String tensach,String tacgia,int soluong) {
		sach themSach=new sach();
		themSach.setMasach(masach);
		themSach.setTacgia(tacgia);
		themSach.setTensach(tensach);
		themSach.setSoluong(soluong);
		SachRepository.save(themSach);
	}
	
	//sửa sách
	public void suasachService(String masach,String tensach,String tacgia,int soluong) {
		SachRepository.suasachRepository(masach, tensach, tacgia, soluong);
	}
	
	//xóa sách
	public void xoasachService(String masach) {
		SachRepository.xoasachRepository(masach);
	}
	
	//sắp xếp giảm dần
	public ArrayList<sach>listgiamdanService(){
	return	SachRepository.listgiamdanRepository();
	}
	
	//thay đổi sách
	public void thaydoisachService(String masach,int soluongtonkho) {
		SachRepository.thaydoisachRepository(masach, soluongtonkho);
	}
	
	
	
	
	
	
	
	
	
}
