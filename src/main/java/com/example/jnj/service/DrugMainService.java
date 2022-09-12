package com.example.jnj.service;

import com.example.jnj.dto.DrugMainDTO;
import com.example.jnj.dto.DrugRecordDTO;
import com.example.jnj.entity.DrugMain;
import com.example.jnj.entity.DrugRecord;
import com.example.jnj.repository.DrugMainRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DrugMainService {
    final private DrugMainRepository drugMainRepository;

    @Transactional
    public List<DrugMainDTO> SearchDrugName(String productName) {
        List<DrugMain> drugRecordList = drugMainRepository.findByProductNameContaining(productName);
        List<DrugMainDTO> drugRecordDTOList = new ArrayList<>();

        for (DrugMain drugMain : drugRecordList) {
            drugRecordDTOList.add(DrugMainDTO.findDrugName(drugMain));


        }
        return drugRecordDTOList;

    }
}
