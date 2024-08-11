package com.example.buoi90.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.buoi90.model.sach;
import com.example.buoi90.model.sachmuon;
import com.example.buoi90.service.sachService;
import com.example.buoi90.service.sachmuonService;

//Quản lý sách trong thư viện:
//Tạo một lớp sách để đại diện cho thông tin của một quyển sách với các thuộc tính như mã sách, tên sách, tác giả, số lượng tồn kho
//Nhập n quyển sách
//sửa sách
//xóa sách
//sắp xếp giảm dần theo số lượng kho
//Xử lý việc mượn sách
//Xử lý việc  trả sách
//xem số lượng tồn kho còn lại là bao nhiêu

@RestController
public class sachController {
@Autowired
sachService SachService;

@Autowired
sachmuonService SachmuonService;

	//hiển thị toàn bộ thông tin sách
	@GetMapping("/list")
	ArrayList<sach>listsachController(){
		return SachService.listsachService();
	}
	
	//thêm sách cách 1
	@PostMapping("/themsach1")
	String themsach1Controller(@RequestParam("masach")String masach,@RequestParam("tensach")String tensach,
			@RequestParam("tacgia")String tacgia,@RequestParam("soluong")int soluong) {
		int kt=0;
		if(SachService.check(masach)==true) {
			kt=1;
		}
		if(kt==1) {
			return "mã sách "+masach+" đã tồn tại";
		}else {
			SachService.themsach1Service(masach, tensach, tacgia, soluong);
			return "thêm mã sách "+masach+" thành công";
		}
	}
	
	//thêm sách cách 2
	@PostMapping("/themsach2")
	String themsach2Controller(@RequestParam("masach")String masach,@RequestParam("tensach")String tensach,
			@RequestParam("tacgia")String tacgia,@RequestParam("soluong")int soluong) {
		int kt=0;
		if(SachService.check(masach)==true) {
			kt=1;
		}
		if(kt==1) {
			return "mã sách "+masach+" đã tồn tại";
		}else {
			SachService.themsach2Service(masach, tensach, tacgia, soluong);
			return "thêm mã sách "+masach+" thành công";
		}
	}
	
	
	//sửa sách
	@PutMapping("/suasach")
	String suasachController(@RequestParam("masach")String masach,@RequestParam("tensach")String tensach,
			@RequestParam("tacgia")String tacgia,@RequestParam("soluong")int soluong) {
		int kt=0;
		if(SachService.check(masach)==true) {
			kt=1;
		}
		if(kt==1) {
			SachService.suasachService(masach, tensach, tacgia, soluong);
			return "sữa mã sách "+masach+" thành công";
		}else {
			return "mã sách "+masach+" ko tồn tại";		
		}
	}
	
	//xóa sách
	@DeleteMapping("/xoasach")
	String xoasachController(@RequestParam("masach")String masach) {
		if(SachService.check(masach)==true) {
			SachService.xoasachService(masach);
			return "xóa mã sách "+masach+" thành công";
		}else {
			return "mã sách "+masach+ " ko tồn tại";
		}
	}
	
	//sắp xếp giảm dần
	@GetMapping("/listgiamdan")
	ArrayList<sach>listgiamdanController(){
		return SachService.listgiamdanService();
	}
	
	// xử lý việc mượn sách
	@PutMapping("/muonsach")
	String xulymuonsachController(@RequestParam("masach") String masach, @RequestParam("soluongmuon") int soluongmuon) {
		int kt = 0;
		if (SachService.check(masach) == true) {
			kt = 1;
		}
		if (kt == 0) {
			return "mã sách " + masach + " ko tồn tại";
		} else {
			ArrayList<sach> listsach = SachService.listsachService();
			ArrayList<sachmuon>listsachmuon=SachmuonService.listsachmuonService();
			int checksoluongconlai = 0;	
			for (int i=0;i<listsach.size();i++) {
				if(listsach.get(i).getMasach().equals(masach)&&listsach.get(i).getSoluong()>=soluongmuon) {
					checksoluongconlai=1;		
					break;
				}
			}
			if(checksoluongconlai==1) {
				for(sach i:listsach) {
					if(i.getMasach().equals(masach)) {
						SachService.thaydoisachService(masach, i.getSoluong() - soluongmuon);
						int checksach2=0;
						for(sachmuon j:listsachmuon) {
							if(j.getMasach().equals(masach)) {
								checksach2=1;
								SachmuonService.xulymuonsachService(masach, j.getTensach(), 
										j.getTacgia(),j.getSoluong()+soluongmuon);
								break;
							}
						}
						if(checksach2==0) {
							SachmuonService.xulymuonsachService(masach, i.getTensach(), 
									i.getTacgia(),soluongmuon);
						}
					}
				}		
				return "cho mượn "+masach+" thành công";
			}else {
				return "mã sách "+masach+" còn trong kho ko đủ số lượng mượn";
			}
		}
	}
	
	
	//xử lý trả sách
	@PutMapping("/trasach")
	String xulytrasachController(@RequestParam("masach")String masach,@RequestParam("soluongtra")int soluongtra) {
		int kt=0;
		if(SachmuonService.check(masach)==true) {
			kt=1;
		}
		if(kt==0) {
			return "mã sách "+masach+" ko tồn tại";
		}else {
			ArrayList<sachmuon>listsachmuon=SachmuonService.listsachmuonService();
			ArrayList<sach>listsach=SachService.listsachService();
			int checksoluong=0;
			for(sachmuon i:listsachmuon) {
				if(i.getSoluong()>=soluongtra) {
					checksoluong=1;
					break;
				}else {
					checksoluong=0;
				}				
			}
			if(checksoluong==1) {
				for(sachmuon i:listsachmuon) {
					int checksach2=0;
				if(i.getMasach().equals(masach)) {	
						if(i.getSoluong()-soluongtra>0) {
							SachmuonService.thaydoisachmuonService(masach, i.getSoluong()-soluongtra);
						}else if(i.getSoluong()-soluongtra==0) {
							SachmuonService.xulytrasachService(masach);
						}
						for( sach j:listsach) {
							if(j.getMasach().equals(masach)) {
								checksach2=1;
								SachService.thaydoisachService(masach, j.getSoluong()+soluongtra);
								break;		
							}
						}
						if(checksach2==0) {
							for(sach j:listsach) {
								SachService.themsach2Service(masach, j.getTensach(), j.getTacgia(), soluongtra);
								break;
							}
						}
					}
					break;
				}
			
				return "trả mã sách "+masach+" thành công";
			}else {
				return "số lượng trả "+masach+" ko đúng";
			}
		}
	}
	
	
	
}
