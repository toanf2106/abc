package com.example.student.repository;

import com.example.student.model.HocSinh;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface hocSinhRepo extends JpaRepository<HocSinh,Integer> {

}
