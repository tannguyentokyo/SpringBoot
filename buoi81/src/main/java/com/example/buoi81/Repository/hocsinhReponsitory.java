package com.example.buoi81.Repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.buoi81.model.HocSinh;
@Repository
public interface hocsinhReponsitory extends JpaRepository<HocSinh, String>{
	// lấy tất cả học sinh
@Query(nativeQuery = true,value = "select * from hocsinh")
ArrayList<HocSinh>listHocSinhs();

  // lấy học sinh trên 20 tuổi
@Query(nativeQuery = true,value = "select * from hocsinh where Tuoi >20")
ArrayList<HocSinh>listHStren20();

//Sắp xếp tăng dần theo tuôi
@Query(nativeQuery = true,value = "select * from hocsinh order by Tuoi asc")
ArrayList<HocSinh>sapxep();

//Tìm kiếm tên của người dùng nguyen van a              //like phải có dấu % %, khi tìm tên cụ thể thì phải có dấu ''
@Query(nativeQuery = true,value = "select * from hocsinh where Ten like '%nguyen van a%'")
ArrayList<HocSinh>TimNguyenvana();

//tìm kiếm người dùng theo tên                         // khi tìm theo tên tìm kiếm thì ko có dấu  '', mà thêm dấu  :
@Query(nativeQuery = true,value = "select * from hocsinh where Ten like %:Ten%")
ArrayList<HocSinh>timkiem(@Param("Ten")String TenSringBoot3);

//Tìm các nhân viên có tuổi lớn hơn 25 hoặc có tên theo tìm kiếm
@Query(nativeQuery = true,value = "select * from hocsinh where Ten like %:Ten% or Tuoi > 25")
ArrayList<HocSinh>Tim2(@Param("Ten")String ten);

//check MS học sinh có tồn tại chưa
@Query(nativeQuery = true,value = "select * from hocsinh where Mahocsinh = :id ")
HocSinh checkID(@Param("id")String mahs);

//xóa học sinh
@Modifying
@Query(nativeQuery = true,value = "delete from hocsinh where Mahocsinh= :id  ")
void XoaHS(@Param("id")String mahs);







}
