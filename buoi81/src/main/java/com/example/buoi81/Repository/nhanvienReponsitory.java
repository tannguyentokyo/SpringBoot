package com.example.buoi81.Repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.example.buoi81.model.User;


@Repository
public interface nhanvienReponsitory extends JpaRepository<User,Integer> {
    @Query(nativeQuery = true, value = "SELECT * FROM user")
    ArrayList<User>list();
}
