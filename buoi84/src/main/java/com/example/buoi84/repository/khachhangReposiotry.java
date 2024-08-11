package com.example.buoi84.repository;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.buoi84.model.khachhang;


@Repository
public interface khachhangReposiotry extends JpaRepository<khachhang, String>{
	
	//hiển thị thông tin khách hàng
@Query(nativeQuery = true,value = "select * from khachhang")
ArrayList<khachhang>listkhRepository();

//thêm khách hàng
@Transactional
@Modifying
@Query(nativeQuery = true,value = "insert into khachhang(makhachhang,tenkhachhang,diachi,email,sdt,masanpham) "
		+ "values (:makh,:tenkh,:dc,:email,:sdt,:masp)")
void themkhRepository(@Param("makh")String makh,@Param("tenkh")String tenkh,@Param("dc")String dc,
		@Param("email")String email,@Param("sdt")int sdt,@Param("masp")String masp);

//hiển thị khách hàng đã mua những sản phẩm nào
@Query(nativeQuery = true,value = "select makhachhang,tenkhachhang,diachi,email,sdt,khachhang.masanpham \r\n"
		+ "from khachhang inner join sanpham on khachhang.masanpham=sanpham.masanpham")
ArrayList<khachhang>listkhspRepository();

//hiển thị khách hàng đã mua những sản phẩm lớn hơn 20
@Query(nativeQuery = true,value = "select makhachhang,tenkhachhang,diachi,email,sdt,khachhang.masanpham \r\n"
		+ "from khachhang inner join sanpham on khachhang.masanpham=sanpham.masanpham where soluong > 20")
ArrayList<khachhang>listkhsp20Repository();

//hiển thị khách hàng đã mua những sản phẩm, xếp theo số lượng giảm dần
@Query(nativeQuery = true,value = "select makhachhang,tenkhachhang,diachi,email,sdt,khachhang.masanpham \r\n"
		+ "from khachhang inner join sanpham on khachhang.masanpham=sanpham.masanpham order by soluong desc")
ArrayList<khachhang>listkhspgiamdanRepository();

//tìm kiếm theo tên khách hàng 
@Query(nativeQuery = true,value = "select makhachhang,tenkhachhang,diachi,email,sdt,khachhang.masanpham \r\n"
		+ "from khachhang inner join sanpham on khachhang.masanpham=sanpham.masanpham where tenkhachhang like %:ten%")
ArrayList<khachhang> timkhRepository(@Param("ten")String tenkh);

//tìm kiếm theo tên sản phẩm
@Query(nativeQuery = true, value = "select makhachhang,tenkhachhang,diachi,email,sdt,khachhang.masanpham \r\n"
		+ "from khachhang inner join sanpham on khachhang.masanpham=sanpham.masanpham where tensanpham like %:tensp%")
ArrayList<khachhang>timspRepository(@Param("tensp")String tensp);





}



