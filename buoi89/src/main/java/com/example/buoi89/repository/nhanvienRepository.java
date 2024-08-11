package com.example.buoi89.repository;

import java.sql.Date;
import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.buoi89.model.nhanvien;
@Repository
public interface nhanvienRepository extends JpaRepository<nhanvien, String> {
//	cách tính lương vị trí công việc 
//	nếu vị trí công việc 1 sẽ là 500 1 ngày, 
//	vị trí công việc 2 sẽ là 1000 ngày 
//	vị trí công việc 3 sẽ là 15000 ngày
//	Tạo một lớp Nhân Viên để đại diện cho thông tin của một nhân viên như 
//	mã nhân viên,tên, tuổi, ngày sinh, vị trí công việc, sô ngày làm việc,lương
//
//	1 nhập n nhân viên
//	2.in tất cả thông tin nhân viên
//	3 sắp xếp lương tăng dần
//	4 sửa vị trí công việc cho nhân viên dựa vào mã nhân viên
//	5 xóa nhân viên
	
	
	//hiển thị thông tin nhân viên
@Query(nativeQuery = true,value = "select * from nhanvien")
ArrayList<nhanvien>listnvRepository();

  //nhập thông tin nhân viên cách 1
@Modifying
@Transactional
@Query(nativeQuery = true,value = "insert into "
		+ "nhanvien(manv,ten,tuoi,ngaysinh,vitricongviec,songaylamviec,luong) "
		+ "values (:manv,:ten,:tuoi,:ngaysinh,:vitri,:songay,:luong)")
void themnvRepository(@Param("manv")String manv,@Param("ten")String ten,
		@Param("tuoi")int tuoi,@Param("ngaysinh")Date ngaysinh,
		@Param("vitri")int vitri,@Param("songay")float songay,
		@Param("luong")double luong);


  //sắp xếp nhân viên theo lương tăng dần
@Query(nativeQuery = true,value = "select * from nhanvien order by luong asc")
ArrayList<nhanvien>listtangdanRepository();

//4 sửa vị trí công việc cho nhân viên dựa vào mã nhân viên
@Modifying
@Transactional
@Query(nativeQuery = true,value = "update nhanvien set nhanvien.vitricongviec =:vitri,"
		+ "nhanvien.luong=:luong where nhanvien.manv=:manv")
void suavitriRepostiroy(@Param("manv")String manv,@Param("luong")double luong
		,@Param("vitri")int vitri);


//5 xóa nhân viên
@Modifying
@Transactional
@Query(nativeQuery = true,value = "delete from nhanvien where manv=:manv")
void xoanhanvienRepository(@Param("manv")String manv);






}
