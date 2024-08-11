package com.example.buoi83.repository;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.buoi83.model.sach;

@Repository
public interface sachRepository extends JpaRepository<sach, String>{
	
	//hiển thị thông tin sách
@Query(nativeQuery = true,value = "select * from sach")
ArrayList<sach> listRepository();

//sắp xếp sách tăng dần theo đơn giá
@Query(nativeQuery = true,value = "select * from sach order by dongia asc")
ArrayList<sach>sapxeptangdanRepository2();

//thêm sách
@Transactional
@Modifying
@Query(nativeQuery = true,value = "insert into sach(masach,dongia,tensach,tentg) "
		+ "values (:masach,:dongia,:tensach,:tentg);")
void themRepository(@Param("masach")String masach,@Param("tensach")String tensach,@Param("tentg")String tentg,
		@Param("dongia")int dongia);

//sửa sách
@Transactional
@Modifying
@Query(nativeQuery = true,value = "update sach set sach.tensach = :tensach,sach.tentg=:tentg"
		+ ",sach.dongia= :dongia where sach.masach=:masach")
void suaRepository(@Param("masach")String masach,@Param("tensach")String tensach,@Param("tentg")String tentg,
		@Param("dongia")int dongia);


//xóa sách
@Transactional
@Modifying
@Query(nativeQuery = true,value = "delete from sach where masach=:masach")
void xoaRepository(@Param("masach")String masach);

//tìm kiếm 1 quyển sách theo mã
@Query(nativeQuery = true,value = "select * from sach where masach=:ms")
sach timtheomaReposioty(@Param("ms")String masach);

//tìm kiếm sách theo tên
@Query(nativeQuery = true,value = "select * from sach where tensach like %:ten%")
ArrayList<sach>timtheotenRepository(@Param("ten")String ten);






}
