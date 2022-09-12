package com.example.jnj.controller;

import com.example.jnj.entity.Alarm;
import com.example.jnj.service.AlarmService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/alarm")
public class AlarmController {

   final private AlarmService alarmService ;
    @GetMapping("/delete")
    public void dropAlarm(@RequestParam("aId")Long aId){
        alarmService.delete(aId);
    }

    @PostMapping("/update")
    public void update(@RequestBody Alarm alarm){
        alarmService.update(alarm);
    }


}
