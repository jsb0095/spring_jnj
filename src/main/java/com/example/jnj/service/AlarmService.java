package com.example.jnj.service;

import com.example.jnj.entity.Alarm;
import com.example.jnj.repository.AlarmRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class AlarmService {
   final private AlarmRepository alarmRepository;

    public void save(LocalDateTime drugTime, Long drId) {
        alarmRepository.save(Alarm.save(drId,drugTime));
    }

    public void delete(Long aId) {
        alarmRepository.deleteById(aId);
    }

    public void update(Alarm alarm) {
       alarmRepository.save(Alarm.update(alarm));
    }
}
