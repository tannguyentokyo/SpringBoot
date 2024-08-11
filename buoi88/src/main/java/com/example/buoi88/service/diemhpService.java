package com.example.buoi88.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.buoi88.model.diemhp;
import com.example.buoi88.repository.diemhpRepository;

@Service
public class diemhpService {

	@Autowired 
	diemhpRepository DiemHPRepository;

	//hiển thị thông tin điểm HP
	public ArrayList<diemhp> listdiemHPService(){
		return DiemHPRepository.listdiemHPRepository();
	}
	
	//hiển thị các sinh viên có điểm học phần lớn hơn 8
	public ArrayList<diemhp>listtren8Service(){
		return DiemHPRepository.listtren8Repository();
	}
	
	//Hiển thị các sinh viên sắp xếp tăng dần theo điểm học phần
	public ArrayList<diemhp>listtangdanService(){
		return DiemHPRepository.listtangdanRepository();
	}
	
	//tìm kiếm 1 sinh viên xem được điểm
	public ArrayList<diemhp>timsinhvienService(String tensv){
		return DiemHPRepository.timsinhvienRepository(tensv);
	}
	
	//sửa điểm sinh viên
	//check mã sinh viên
	public boolean check(String masv) {
		ArrayList<diemhp>list=DiemHPRepository.listdiemHPRepository();
		int kt=0;
		for(diemhp i:list) {
			if(i.getSinhvien().getMasv().equals(masv)==true) {
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
	//sửa điểm
	public void suadiemService(String masv, float diemmoi) {
		DiemHPRepository.suadiemRepository(masv, diemmoi);
	}
	
}
