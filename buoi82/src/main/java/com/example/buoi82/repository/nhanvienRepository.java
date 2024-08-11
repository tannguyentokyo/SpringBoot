package com.example.buoi82.repository;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.buoi82.model.nhanvien;

@Repository
public interface nhanvienRepository extends JpaRepository<nhanvien, String> {
	
	//thêm nhân viên
@Transactional
@Modifying
@Query(nativeQuery = true,value = 
"insert into nhanvien(nhanvien.manhanvien,nhanvien.ten,nhanvien.tuoi,nhanvien.diachi,nhanvien.macongty) "
+ "values (:manv,:ten,:tuoi,:diachi,:macty)")
void themnhanvienRepository(@Param("manv")String manv,@Param("ten")String ten,@Param("tuoi")int tuoi,
		@Param("diachi")String diachi,@Param("macty")String macty);

//hiển thị thông tin nhân viên
@Query(nativeQuery = true, value = "select * from nhanvien inner join congty on nhanvien.macongty = congty.macongty")
ArrayList<nhanvien>listnhanvienRepository();

//lấy nhân đang làm ở cty nào có tuổi lớn hơn 20
@Query(nativeQuery = true, value = "select * from nhanvien inner join congty on nhanvien.macongty = congty.macongty "
		+ "where tuoi > 20 ")
ArrayList<nhanvien>listnhanvientren20Repository();



}
