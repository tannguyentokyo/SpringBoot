package com.example.buoi81.Service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.buoi81.Repository.nhanvienReponsitory;
import com.example.buoi81.model.User;

@Service
public class nhanvienService {
	@Autowired
	nhanvienReponsitory nhanvienReponsitory;
    public ArrayList<User> listNhanVien(){
    	ArrayList<User> list=nhanvienReponsitory.list();
    	return list;
    }
}
