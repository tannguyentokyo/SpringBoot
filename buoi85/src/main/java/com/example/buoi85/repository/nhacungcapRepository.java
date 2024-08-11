package com.example.buoi85.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.buoi85.model.nhacungcap;

@Repository
public interface nhacungcapRepository extends JpaRepository<nhacungcap, String>{

	//hiển thị thông tin nhà cung cấp
	@Query(nativeQuery = true,value = "select * from nhacungcap")
	ArrayList<nhacungcap>listnhacungcapRepository();
	
	
	
	
	
}
