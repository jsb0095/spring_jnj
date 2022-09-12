package com.example.jnj.service;

import com.example.jnj.dto.DrugMainDTO;
import com.example.jnj.dto.DrugRecordDTO;
import com.example.jnj.entity.DrugMain;
import com.example.jnj.entity.DrugRecord;
import com.example.jnj.repository.DrugRecordRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DrugRecordService {
    private final DrugRecordRepository drugRecordRepository;
    public void AddRecord(DrugRecordDTO drugRecordDTO) {
       DrugRecord drugRecord = DrugRecord.toSave(drugRecordDTO);
       drugRecordRepository.save(drugRecord);

    }


    @Transactional
    public List<DrugRecordDTO> RecordList(Long memberId) {
      List<DrugRecord>  drugRecordList = drugRecordRepository.findAllByMemberId(memberId);
        List<DrugRecordDTO> drugRecordDTOList = new ArrayList<>();

        for (DrugRecord drugRecord : drugRecordList) {
            drugRecordDTOList.add(DrugRecordDTO.RecordList(drugRecord));


        }
        return drugRecordDTOList;
    }
}
