package com.example.jnj.repository;

import com.example.jnj.entity.DrugMain;
import com.example.jnj.entity.DrugRecord;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DrugMainRepository extends JpaRepository<DrugMain,Long> {
    List<DrugMain> findByProductNameContaining(String productName);


}
