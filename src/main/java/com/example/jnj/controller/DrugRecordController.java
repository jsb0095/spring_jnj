package com.example.jnj.controller;

import com.example.jnj.dto.DrugMainDTO;
import com.example.jnj.dto.DrugRecordDTO;
import com.example.jnj.entity.DrugRecord;
import com.example.jnj.service.AlarmService;
import com.example.jnj.service.DrugRecordService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/drug-record")
@CrossOrigin("*")
public class DrugRecordController {

   private final  DrugRecordService drugRecordService;
   private final AlarmService alarmService;
    @PostMapping("/add")
    public void AddRecord(@RequestBody DrugRecordDTO drugRecordDTO){
        drugRecordService.AddRecord(drugRecordDTO);
        alarmService.save(drugRecordDTO.getDrugTime(),drugRecordDTO.getDrId());




    }


    @GetMapping("/recordList")
    public List<DrugRecordDTO> RecordList(@RequestParam("memberId")Long memberId){
        List<DrugRecordDTO> drugRecordDTOList = drugRecordService.RecordList(memberId);
        return  drugRecordDTOList;
    }
}
