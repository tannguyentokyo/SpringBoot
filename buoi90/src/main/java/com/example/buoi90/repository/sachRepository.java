package com.example.buoi90.repository;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.buoi90.model.sach;

@Repository
public interface sachRepository extends JpaRepository<sach, String>{
	//hiển thị toàn bộ thông tin sách
@Query(nativeQuery = true,value  = "select * from sach")
ArrayList<sach>listsachRepository();


   //thêm sách cách 1
@Modifying
@Transactional
@Query(nativeQuery = true,value = "insert into sach(masach,tensach,tacgia,soluongtonkho) "
		+ "values (:masach,:tensach,:tacgia,:soluong)")
void themsach1Repository(@Param("masach")String masach,@Param("tensach")String tensach,@Param("tacgia")String tacgia,
		@Param("soluong")int soluong);

   
   //sửa sách
@Modifying
@Transactional
@Query(nativeQuery = true,value = "update sach set "
		+ "sach.tensach=:tensach,sach.tacgia=:tacgia,sach.soluongtonkho=:soluong where sach.masach=:masach")
void suasachRepository(@Param("masach")String masach,@Param("tensach")String tensach,@Param("tacgia")String tacgia,
		@Param("soluong")int soluong);

   
   //xóa sách
@Modifying
@Transactional
@Query(nativeQuery = true,value = "delete from sach where masach=:masach")
void xoasachRepository(@Param("masach")String masach);


    //sắp xếp giảm dần
@Query(nativeQuery = true,value = "select * from sach order by soluongtonkho asc")
ArrayList<sach>listgiamdanRepository();
   
     //thay đổi sách
@Modifying
@Transactional
@Query(nativeQuery = true,value = "update sach set sach.soluongtonkho=:soluongtonkho where sach.masach=:masach")
void thaydoisachRepository(@Param("masach")String masach,@Param("soluongtonkho")int soluong);
    



}
