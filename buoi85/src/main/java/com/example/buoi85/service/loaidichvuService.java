package com.example.buoi85.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.buoi85.model.loaidichvu;
import com.example.buoi85.repository.loaidichvuRepository;

@Service
public class loaidichvuService {
@Autowired
loaidichvuRepository LoaidichvuRepository;

//hiển thị thông tin loại dịch vụ
public ArrayList<loaidichvu>listloaidichvuRepository(){
	return LoaidichvuRepository.listloaidichvuRepository();
}






}
