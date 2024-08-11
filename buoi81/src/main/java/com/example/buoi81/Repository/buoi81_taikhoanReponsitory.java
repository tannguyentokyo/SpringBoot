package com.example.buoi81.Repository;

import java.util.ArrayList;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.buoi81.model.buoi81_taikhoan;
@Repository
public interface buoi81_taikhoanReponsitory extends JpaRepository<buoi81_taikhoan, String>{
	
	//hiển thị tất cả tài khoản
@Query(nativeQuery = true,value = "select * from taikhoan")
ArrayList<buoi81_taikhoan>listTKRepository();
  
   //check mã tài khoản đã tồn tại chưa
@Query(nativeQuery = true,value = "select * from taikhoan where Mataikhoan=:matk")
buoi81_taikhoan CheckIDRepository(@Param("matk")String matk);

  // sửa thông tin tài khoản

@Modifying
@Query(nativeQuery = true,
value = "update taikhoan set taikhoan.Tentaikhoan = :tentk , taikhoan.Sotien=:sotien where taikhoan.Mataikhoan=:mtk")
void suaTKRepository(@Param("tentk")String tentk,@Param("sotien")int sotien,@Param("mtk")String matk);


  //xóa tài khoản
@Modifying
@Query(nativeQuery = true,value = "delete from taikhoan where Mataikhoan=:mtk ")
void xoaTKRepository(@Param("mtk")String mtk);

 //tìm kiếm tài khoản theo mã tài khoản
@Query(nativeQuery = true,value = "select * from taikhoan where Tentaikhoan like %:ten%")
ArrayList<buoi81_taikhoan>timtheotenRepository(@Param("ten")String ten);


//6 hiển thị các tài khoản có số tiền >= 1000
@Query(nativeQuery = true,value = "select * from taikhoan where Sotien >= 1000 ")
ArrayList<buoi81_taikhoan>listtheosotienRepository();
}




