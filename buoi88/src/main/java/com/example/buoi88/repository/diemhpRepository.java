package com.example.buoi88.repository;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.example.buoi88.model.diemhp;

//Nhập dữ liệu
//Hiển thị các sinh viên có điểm học phần lớn hơn 8
//Hiển thị các sinh viên sắp xếp tăng dần theo điểm học phần
//Tìm kiếm 1 sinh viên xem được điểm
//sửa 1 sinh viên

@Repository
public interface diemhpRepository extends JpaRepository<diemhp, String>{
//hiển thị thông tin điểm học phần
	@Query(nativeQuery = true,value = "select * from diemhp")
	ArrayList<diemhp>listdiemHPRepository();
	
//hiển thị các sinh viên có điểm học phần lớn hơn 8
	@Query(nativeQuery = true,value = "select * from \r\n"
			+ "sinhvien inner join diemhp on sinhvien.masv=diemhp.masv\r\n"
			+ "where diemhp >=8")
	ArrayList<diemhp>listtren8Repository();
	
	//Hiển thị các sinh viên sắp xếp tăng dần theo điểm học phần
	@Query(nativeQuery = true,value = "select * from \r\n"
			+ "sinhvien inner join diemhp on sinhvien.masv=diemhp.masv\r\n"
			+ "order by diemhp asc;")
	ArrayList<diemhp>listtangdanRepository();
	
	//tìm kiếm 1 sinh viên xem được điểm
	@Query(nativeQuery = true,value = "select * from diemhp inner join sinhvien on sinhvien.masv=diemhp.masv\r\n"
			+ "where hoten like %:n%")
	ArrayList<diemhp>timsinhvienRepository(@Param("n")String tensv);
	
	//sửa điểm sinh viên theo mã
	@Modifying
	@Transactional
	@Query(nativeQuery = true,
	value = "update diemhp set diemhp.diemhp=:diem where diemhp.masv=:masv")
	void suadiemRepository(@Param("masv")String masv,@Param("diem")float diemmoi);
	
}
