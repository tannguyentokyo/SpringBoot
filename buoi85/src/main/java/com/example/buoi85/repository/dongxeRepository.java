package com.example.buoi85.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.buoi85.model.dongxe;

@Repository
public interface dongxeRepository extends JpaRepository<dongxe, String>{

	//hiển thị thông tin dòng xe
	@Query(nativeQuery = true,value = "select * from dongxe")
	ArrayList<dongxe>listdongxeRepository();
	
	
	//Câu 2
	//Liệt kê những dòng xe có số chỗ ngồi trên 5 chỗ
	@Query(nativeQuery = true,value = "select * from dongxe where so_cho_nguoi >5")
	ArrayList<dongxe> listdongxetren5Repository();
}
