package com.example.buoi82.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.buoi82.model.congty;
import com.example.buoi82.repository.congtyRepository;

@Service
public class congtyService {
@Autowired 
congtyRepository congtyRepository;

//hiển thị công ty
public ArrayList<congty>listcongtyService(){
	return congtyRepository.ListcongtyRepository();
}

//thêm công ty
public void themcongtyService(String macty,String tencty) {
	congtyRepository.themcongtyRepository(macty, tencty);
}

//sửa công ty
public void suacongtyService(String macty,String tencty) {
	congtyRepository.suacongtyRepository(macty, tencty);
}

//xóa cty
public void xoacongtyService(String macty) {
	congtyRepository.xoacongtyRepository(macty);
}
}
