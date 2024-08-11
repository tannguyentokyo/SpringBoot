package com.example.buoi89.service;

import java.sql.Date;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.buoi89.model.nhanvien;
import com.example.buoi89.repository.nhanvienRepository;

@Service
public class nhanvienService {
@Autowired
nhanvienRepository NhanvienRepository;


	//hiển thị thông tin nhân viên
	public ArrayList<nhanvien>listnvService(){
		return NhanvienRepository.listnvRepository();
	}
	
	//check manv
	public boolean check(String manv) {
		ArrayList<nhanvien>list=NhanvienRepository.listnvRepository();
		int kt=0;
		for(nhanvien i:list) {
			if(i.getManv().equals(manv)) {
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
	
	//nhập thông tin nhân viên cách 1
	public void themnvcach1Service(String manv,String ten, int tuoi,Date ngaysinh,
			int vitri,float songay,double luong){	
		NhanvienRepository.themnvRepository(manv, ten, tuoi, ngaysinh, vitri, songay, luong);
	}
	
	//nhập thông tin nhân viên cách 2
	public void themnvcach2Service(String manv,String ten, int tuoi,Date ngaysinh,
			int vitri,float songay,double luong) {
		nhanvien themNhanvien=new nhanvien();
		themNhanvien.setManv(manv);
		themNhanvien.setTennv(ten);
		themNhanvien.setTuoi(tuoi);
		themNhanvien.setNgaysinh(ngaysinh);
		themNhanvien.setVitricongviec(vitri);
		themNhanvien.setSongaylamviec(songay);
		themNhanvien.setLuong(luong);
		NhanvienRepository.save(themNhanvien);
	}
	
	
//	//sắp xếp nhân viên lương tăng dần
	public ArrayList<nhanvien>listtangdanService(){
	return	NhanvienRepository.listtangdanRepository();
	}
	
	
	//4 sửa vị trí công việc cho nhân viên dựa vào mã nhân viên
	public void suavitriService(String manv,double luong,int vitri) {
		NhanvienRepository.suavitriRepostiroy(manv, luong, vitri);
	}
	
	//5 xóa nhân viên
	public void xoanhanvienService(String manv) {
		NhanvienRepository.xoanhanvienRepository(manv);
	}
	
	
	
	
	
	
}
