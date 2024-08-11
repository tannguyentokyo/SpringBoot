package com.example.buoi86.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.buoi86.model.nhanvien;
@Repository
public interface nhanvienRepository extends JpaRepository<nhanvien, String>{

//hiển thị thông tin nhân viên
	@Query(nativeQuery = true,value = "select * from nhanvien")
	ArrayList<nhanvien>listnhanvienRepository();
	
	//hiển thị thông tin nhân viên ở phòng lập trình web
	@Query(nativeQuery = true,value = "select * from nhanvien inner join phongban "
			+ "on nhanvien.maphongban=phongban.maphongban where tenphongban='lập trình web';")
	ArrayList<nhanvien>listnhanvienwebRepository();
	
	//sắp xếp tuổi tăng dần của nhân viên
	@Query(nativeQuery = true,value = "select * from nhanvien order by tuoinhanvien asc")
	ArrayList<nhanvien>listnhanvientangdanRepository();
	
	//hiển thị nhân viên lớn hơn 23 tuổi
	@Query(nativeQuery = true,value = "select * from nhanvien where tuoinhanvien>23;")
	ArrayList<nhanvien>listnhanvientren23Repository();
	
	//hiển thị nhân viên quê ở huế
	@Query(nativeQuery = true,value = "select * from nhanvien where diachi = 'huế';")
	ArrayList<nhanvien>listnhanvienhueRepository();
}
