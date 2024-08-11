package com.example.buoi85.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.buoi85.model.dangkycungcap;




@Repository
public interface dangkycungcapRepository extends JpaRepository<dangkycungcap, String>{

	//hiển thị thông tin đăng ký cung cấp
	@Query(nativeQuery = true,value = "select * from dangkycungcap")
	ArrayList<dangkycungcap>listdangkycungcapRepository();
	
	//Câu 3
		//Liệt kê thông tin của các nhà cung cấp đã từng đăng ký cung cấp những dòng xe
		//thuộc hãng xe “Toyota” với mức phí có đơn giá là 10.000  hoặc những dòng xe
		//thuộc hãng xe “KIA” với mức phí có đơn giá là 15.000 
		@Query(nativeQuery = true, value = "select * from dangkycungcap inner join nhacungcap \r\n"
				+ "on nhacungcap.ma_nha_cung_cap=dangkycungcap.ma_nha_cung_cap\r\n"
				+ "inner join dongxe on dongxe.dong_xe=dangkycungcap.dong_xe\r\n"
				+ "inner join mucphi on mucphi.ma_muc_phi=dangkycungcap.ma_muc_phi\r\n"
				+ "where hang_xe = 'Toyota' and don_gia =10000 or hang_xe ='KIA' and don_gia = 15000;")
		ArrayList<dangkycungcap>listnhacungcapcau3Repository();
		
		//Câu 4
		//Liệt kê thông tin của các nhà cung cấp đã từng đăng ký cung cấp phương tiện
		//thuộc dòng xe “toyota” hoặc từng đăng ký cung cấp phương tiện thuộc dòng xe “KIA”
		@Query(nativeQuery = true,value = "select * from dangkycungcap inner join nhacungcap\r\n"
				+ "on nhacungcap.ma_nha_cung_cap=dangkycungcap.ma_nha_cung_cap\r\n"
				+ "inner join dongxe on dongxe.dong_xe=dangkycungcap.dong_xe\r\n"
				+ "where hang_xe ='Toyota' or hang_xe ='KIA';")
		ArrayList<dangkycungcap>listnhacungcapcau4Repository();
		
		//Câu 5s. Liệt kê thông tin của các nhà cung cấp đã từng đăng ký cung cấp với mức phí có đơn giá là 15.000
		@Query(nativeQuery = true, value = "select * from dangkycungcap inner join nhacungcap\r\n"
				+ "on nhacungcap.ma_nha_cung_cap=dangkycungcap.ma_nha_cung_cap\r\n"
				+ "inner join mucphi on mucphi.ma_muc_phi=dangkycungcap.ma_muc_phi\r\n"
				+ "where don_gia=15000;")
		ArrayList<dangkycungcap>listnhacungcapcau5Repository();
	
	//Câu 6. Hiển thị nhà cung cấp đã đăng kí những dịch vụ nào
		@Query(nativeQuery = true,value = "select * from dangkycungcap inner join nhacungcap\r\n"
				+ "on nhacungcap.ma_nha_cung_cap=dangkycungcap.ma_nha_cung_cap\r\n"
				+ "inner join loaidichvu on loaidichvu.ma_loai_dich_vu=dangkycungcap.ma_loai_dich_vu;")
		ArrayList<dangkycungcap>listnhacungcapcau6Repository();
		
		//Câu 7. Hiển thị nhà cung cấp có số lượng xe lớn hơn 5
		@Query(nativeQuery = true,value = "select * from dangkycungcap inner join nhacungcap\r\n"
				+ "on nhacungcap.ma_nha_cung_cap=dangkycungcap.ma_nha_cung_cap\r\n"
				+ "where so_luong_xe_dang_ky > 5;")
		ArrayList<dangkycungcap>listnhacungcapcau7Repository();
	
		//Câu 8 Hiển thị dòng xe có đơn giá lớn hơn 10000
		@Query(nativeQuery = true,value = "select * from dangkycungcap inner join dongxe\r\n"
				+ "on dangkycungcap.dong_xe=dongxe.dong_xe\r\n"
				+ "inner join mucphi on dangkycungcap.ma_muc_phi=mucphi.ma_muc_phi\r\n"
				+ "where don_gia > 10000;")
		ArrayList<dangkycungcap>listdongxecau8Repository();
		
		
		
}
