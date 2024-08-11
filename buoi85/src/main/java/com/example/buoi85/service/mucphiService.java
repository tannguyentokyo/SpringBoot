package com.example.buoi85.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.buoi85.model.mucphi;
import com.example.buoi85.repository.mucphiRepository;

@Service
public class mucphiService {
@Autowired
mucphiRepository MucphiRepository;

//hiển thị thông tin mức phí
public ArrayList<mucphi>listmucphiService(){
	return MucphiRepository.listmucphiRepository();
}





}
