package com.example.jnj.repository;

import com.example.jnj.entity.DrugMain;
import com.example.jnj.entity.DrugRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DrugRecordRepository extends JpaRepository<DrugRecord,Long> {
    List<DrugRecord> findAllByMemberId(Long memberId);
}