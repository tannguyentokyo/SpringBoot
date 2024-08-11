package com.example.buoi90.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.buoi90.model.sachmuon;
import com.example.buoi90.repository.sachmuonRepository;

@Service
public class sachmuonService {
@Autowired
sachmuonRepository SachmuonRepository;

    //hiển thị sách mượn
     public ArrayList<sachmuon>listsachmuonService(){
    	 return SachmuonRepository.listsachmuonRepository();
     }
     
     //check mã sách 
     public boolean check(String masach) {
    	 ArrayList<sachmuon>listsachArrayList=SachmuonRepository.listsachmuonRepository();
    	 int kt=0;
    	 for(sachmuon i:listsachArrayList) {
    		 if(i.getMasach().equals(masach)==true) {
    			 kt=1;
    		 }
    	 }
    	 if(kt==1) {
    		 return true;
    	 }else {
			return false;
		}
     }


    //xử lý mượn sách
     public void xulymuonsachService(String masach,String tensach,String tacgia,int soluong) {
    	 sachmuon mSachmuon=new sachmuon();
    	 mSachmuon.setMasach(masach);
    	 mSachmuon.setTensach(tensach);
    	 mSachmuon.setTacgia(tacgia);
    	 mSachmuon.setSoluong(soluong);
    	 SachmuonRepository.save(mSachmuon);
     }
     
     //xử lý trá sách
     public void xulytrasachService(String masach) {
    	 SachmuonRepository.xulytrasachRepository(masach);
     }
     
   //thay đổi sách
 	public void thaydoisachmuonService(String masach,int soluongtonkho) {
 		SachmuonRepository.thaydoisachmuonRepository(masach, soluongtonkho);
 	}



}
