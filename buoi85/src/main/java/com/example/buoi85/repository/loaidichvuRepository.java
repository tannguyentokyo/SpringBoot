package com.example.buoi85.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.buoi85.model.loaidichvu;

@Repository
public interface loaidichvuRepository extends JpaRepository<loaidichvu, String> {

	//hiển thị thông tin loại dịch vụ
	@Query(nativeQuery = true,value = "select * from loaidichvu")
	ArrayList<loaidichvu>listloaidichvuRepository();
}
