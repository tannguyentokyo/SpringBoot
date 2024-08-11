package com.example.buoi85.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.buoi85.model.mucphi;

@Repository
public interface mucphiRepository extends JpaRepository<mucphi, String>{

	//hiển thị thông tin mức phí
	@Query(nativeQuery = true,value = "select * from mucphi")
	ArrayList<mucphi>listmucphiRepository();
}
