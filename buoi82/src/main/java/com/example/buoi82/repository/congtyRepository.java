package com.example.buoi82.repository;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.buoi82.model.congty;
@Repository
public interface congtyRepository extends JpaRepository<congty, String> {
	
	//hiển thị thông tin cty
@Query(nativeQuery = true,value = "select * from congty")
ArrayList<congty> ListcongtyRepository();

//thêm công ty
@Transactional
@Modifying
@Query(nativeQuery = true, value = "insert into congty(Macongty,Tencongty) values (:macty,:tencty)")
void themcongtyRepository(@Param("macty")String macty,@Param("tencty")String tencty); 


//sửa công ty
@Transactional
@Modifying
@Query(nativeQuery = true,value = "update congty set Tencongty = :tencty where congty.macongty = :macty")
void suacongtyRepository(@Param("macty")String macty,@Param("tencty")String tencty);

//xóa công ty
@Transactional
@Modifying
@Query(nativeQuery = true,value = "delete from congty where congty.macongty = :macty")
void xoacongtyRepository(@Param("macty")String macty);
}
