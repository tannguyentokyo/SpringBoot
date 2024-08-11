package com.example.buoi84.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.buoi84.model.khachhang;
import com.example.buoi84.service.khachhangService;
import com.example.buoi84.service.sanphamService;

//tạo 1 class sản phẩm gồm mã sản phẩm, tên sản phẩm, số lượng ,xuất sứ,số lượng
//tạo 1 class Khách hàng gồm mã khách hàng,tên khách hàng, email, số điện thoại, địa chỉ, mã sản phẩm

//1 thực hiện thêm, khách hàng và sản phẩm
//2 hiển thị những khách hàng nào đang mua những sản phẩm nào
//3 hiển thị các khách hàng nào nào mua số lượng lớn hơn 20
//4 hiển thị khách hàng đang mua sản phẩm nào sắp xếp theo giảm dần về số lượng
//5 tìm tên của 1 khách hàng nào đó đang mua những sản phẩm nào
//6 tìm kiếm tên 1 sản phẩm xem những khách hàng nào đang mua những sản phẩm đó

@RestController
public class khachhangController {
@Autowired
khachhangService KhachhangService;
@Autowired
sanphamService SanphamService;

//hiển thị khách hàng
@GetMapping("/listkh")
ArrayList<khachhang>listkhController(){
	return KhachhangService.listkhService();
}

//thêm khách hàng
@PostMapping("/themkh")
String themkhController(@RequestParam("makh") String makh, @RequestParam("tenkh") String tenkh,
		@RequestParam("diachi") String diachi, @RequestParam("email") String email, @RequestParam("sdt") int sdt,
		@RequestParam("masp") String masp) {
	if (KhachhangService.checkkh(makh) == true) {
		return "mã khách hàng " + makh + " đã tồn tại";
	} else {
		if (SanphamService.checksp(masp) == true ) {
			KhachhangService.themkhService(makh, tenkh, email, diachi, sdt, masp);
			return "thêm mã khách hàng " + makh + " thành công";
		} else {
			if (masp == "") {
				KhachhangService.themkhService(makh, tenkh, email, diachi, sdt, null);
				return "thêm mã khách hàng " + makh + " thành công";
			} else {
				return "mã sp " + masp + " ko tồn tại";
			}
		}
	}
} // khi sản phẩm ko có hoặc ko trùng với mã sản phẩm thì sao????


//hiển thị khách hàng đã mua sản phẩm nào
@GetMapping("/listkhsp")
ArrayList<khachhang>listkhsp(){
	return KhachhangService.listkhspService();
}

//hiển thị khách hàng đã mua sản phẩm trên 20
@GetMapping("/listkhsp20")
ArrayList<khachhang>listkhsp20(){
	return KhachhangService.listkhsp20Service();
}
// muốn hiển thị luôn số lượng của sản phẩm thì sao???


//hiển thị khách hàng đã mua những sản phẩm, xếp theo số lượng giảm dần
@GetMapping("/listkhspgiamdan")
ArrayList<khachhang>listkhspgiamdanController(){
	return KhachhangService.listkhspgiamdanService();
}

//tìm kiếm theo tên khách hàng 
@GetMapping("/timkh")
ArrayList<khachhang>timkhController(@RequestParam("tenkh")String ten){
	return KhachhangService.timkhService(ten);
}

//tìm kiếm theo tên sản phẩm
@GetMapping("/timsp")
ArrayList<khachhang>timspController(@RequestParam("tensp")String ten){
	return KhachhangService.timspService(ten);
}






}
