package com.example.buoi85.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.buoi85.model.dongxe;
import com.example.buoi85.repository.dongxeRepository;

@Repository
public class dongxeService {
@Autowired
dongxeRepository DongxeRepository;

//hiển thị thông tin dòng xe
public ArrayList<dongxe>listdongxeService(){
	return DongxeRepository.listdongxeRepository();
}


//hiển thị dòng xe có số chỗ ngồi trên 5
public ArrayList<dongxe> listdongxetren5Service() {
	return DongxeRepository.listdongxetren5Repository();
}




}
