package com.example.buoi84.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.buoi84.model.sanpham;

@Repository
public interface sanphamRepository extends JpaRepository<sanpham, String> {
	
	//hiển thị thông tin sản phẩm
@Query(nativeQuery = true,value = "select * from sanpham")
ArrayList<sanpham>listspRepository();

}
