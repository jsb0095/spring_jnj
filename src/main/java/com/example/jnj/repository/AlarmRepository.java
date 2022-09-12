package com.example.jnj.repository;

import com.example.jnj.entity.Alarm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlarmRepository extends JpaRepository<Alarm,Long> {
}
