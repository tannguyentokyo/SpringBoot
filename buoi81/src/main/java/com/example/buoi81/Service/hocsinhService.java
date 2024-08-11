package com.example.buoi81.Service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.buoi81.Repository.hocsinhReponsitory;
import com.example.buoi81.model.HocSinh;
@Service
public class hocsinhService {
@Autowired
hocsinhReponsitory hocsinhReponsitoryList;

//lấy tất cả học sinh
public ArrayList<HocSinh>listHS(){
	ArrayList<HocSinh>list=hocsinhReponsitoryList.listHocSinhs();
	return list;	
}

// lấy học sinh trên 20 tuổi
public ArrayList<HocSinh>listHS20(){
	ArrayList<HocSinh>list=hocsinhReponsitoryList.listHStren20();
	return list;
}

//Sắp xếp tăng dần theo tuôi
public ArrayList<HocSinh>sapxeptuoi(){
	ArrayList<HocSinh>list=hocsinhReponsitoryList.sapxep();
	return list;
}

//Tìm kiếm tên của người dùng nguyen van a
public ArrayList<HocSinh>TimNguyenvana(){
	ArrayList<HocSinh>list=hocsinhReponsitoryList.TimNguyenvana();
	return list;
}

//Tìm kiếm theo tên người dùng
public ArrayList<HocSinh>timkiemTen(String TenSpringBoot2){
	ArrayList<HocSinh>list=hocsinhReponsitoryList.timkiem(TenSpringBoot2);
			return list;
}

//Tìm các nhân viên có tuổi lớn hơn 25 hoặc có tên theo tìm kiếm
public ArrayList<HocSinh>Tim2(String ten){
	ArrayList<HocSinh>list=hocsinhReponsitoryList.Tim2(ten);
	return list;
}


//kiểm tra mã HS có tồn tại chưa
public boolean kiemtraID(String id) {                
	if(hocsinhReponsitoryList.checkID(id)!=null) {
		return false;
	}else {
		return true;
	}
}

//thêm học sinh mới
@Transactional
public void Them(String mahs,String ten,int tuoi, String diachi) {
	HocSinh HS=new HocSinh();
	HS.setMaHocSinh(mahs);
	HS.setTenString(ten);
	HS.setTuoi(tuoi);
	HS.setDiachiString(diachi);
	hocsinhReponsitoryList.save(HS);
}


//xóa học sinh
@Transactional
public void Xoa(String mahs) {
	hocsinhReponsitoryList.XoaHS(mahs);
	
}



}