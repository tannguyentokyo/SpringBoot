package com.example.buoi85.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.buoi85.model.nhacungcap;
import com.example.buoi85.repository.nhacungcapRepository;

@Service
public class nhacungcapService {
@Autowired 
nhacungcapRepository NhacungcapRepository;

//hiển thị thông tin nhà cung cấp
public ArrayList<nhacungcap>listnhacungcapService(){
	return NhacungcapRepository.listnhacungcapRepository();
}




}
