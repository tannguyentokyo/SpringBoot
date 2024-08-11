package com.example.buoi81.Service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.buoi81.Repository.buoi81_taikhoanReponsitory;
import com.example.buoi81.model.buoi81_taikhoan;

@Service
public class buoi81_taikhoanService {
@Autowired
buoi81_taikhoanReponsitory listTKReponsitory2;

//hiển thị tất cả tài khoản
public ArrayList<buoi81_taikhoan>listTKService(){
	ArrayList<buoi81_taikhoan>list=listTKReponsitory2.listTKRepository();
	return list;
}

//check tài khoản đã tồn tại chưa?
public boolean kiemtraID(String id) {
	if(listTKReponsitory2.CheckIDRepository(id)==null) {
		return true;
	}else {
		return false;
	}
}

//thêm tài khoản
@Transactional
public void themService(String matk,String tentk,int sotien) {
	buoi81_taikhoan taikhoan=new buoi81_taikhoan();
	taikhoan.setMataikhoan(matk);
	taikhoan.setTentaikhoan(tentk);
	taikhoan.setSotien(sotien);
	listTKReponsitory2.save(taikhoan);
}

//sửa thông tin tài khoản
@Transactional
public void suaTKService(String tentk,int sotien,String mtk){
	buoi81_taikhoan taikhoan=new buoi81_taikhoan();
//	taikhoan.setMataikhoan(mtk);
//	taikhoan.setTentaikhoan(tentk);
//	taikhoan.setSotien(sotien);
//	listTKReponsitory2.save(taikhoan);
	listTKReponsitory2.suaTKRepository(tentk, sotien, mtk);
}

//xóa tài khoản
@Transactional
public void xoaTKService(String matk) {
	listTKReponsitory2.xoaTKRepository(matk);
}

//tìm tài khoản theo tên
public ArrayList<buoi81_taikhoan>timtheotenService(String ten){
	ArrayList<buoi81_taikhoan>list=listTKReponsitory2.timtheotenRepository(ten);
	return list;
}

//6 hiển thị các tài khoản có số tiền >= 1000
public ArrayList<buoi81_taikhoan>listtheosotienService(){
	return listTKReponsitory2.listtheosotienRepository();
}


}
