package com.example.buoi90.repository;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.buoi90.model.sachmuon;

@Repository
public interface sachmuonRepository extends JpaRepository<sachmuon, String>{

	//hiển thị danh sách sách mượn
	@Query(nativeQuery = true,value = "select * from sachmuon")
	ArrayList<sachmuon>listsachmuonRepository();
	
	//xử lý mượn sách: trong sachmuonService
	
	//xử lý trả sách
	@Modifying
	@Transactional
	@Query(nativeQuery = true,value = "delete from sachmuon where masach=:masach")
	void xulytrasachRepository(@Param("masach")String masach);
	
    //thay đổi sách
@Modifying
@Transactional
@Query(nativeQuery = true,value = "update sachmuon set sachmuon.soluong=:soluong where sachmuon.masach=:masach")
void thaydoisachmuonRepository(@Param("masach")String masach,@Param("soluong")int soluong);
	
	
	
}
