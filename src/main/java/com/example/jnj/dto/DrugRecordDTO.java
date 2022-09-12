package com.example.jnj.dto;

import com.example.jnj.entity.DrugRecord;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DrugRecordDTO {
    private Long drId; // 약기록 아이디
    private Long rxId; // 처방전 아이디
    private Long memberId; // 회원번호
    private Long familyId; // 그륩번호
    private String disease; // 질병
    private String drugName; //복약 약
    private LocalDateTime drugStart;// 복약시작일
    private LocalDateTime drugEnd;// 복약종료일
    private String drugUnit;// 복약량
    private LocalDateTime drugTime;//복약 시간
    private String hospitalName;
    private String medicinPerscripteur;
    private String pharmacyName;

    public static DrugRecordDTO findDrugName(DrugRecord drugRecord) {
        DrugRecordDTO drugRecordDTO = new DrugRecordDTO();
        drugRecordDTO.setDrugName(drugRecord.getDrugName());
        return drugRecordDTO;
    }

    public static DrugRecordDTO RecordList(DrugRecord drugRecord) {
        DrugRecordDTO drugRecordDTO = new DrugRecordDTO();
        drugRecordDTO.setDrId(drugRecord.getDrId());
        drugRecordDTO.setMemberId(drugRecord.getMemberId());
        drugRecordDTO.setFamilyId(drugRecord.getFamilyId());
        drugRecordDTO.setDisease(drugRecord.getDisease());
        drugRecordDTO.setDrugName(drugRecord.getDrugName());
        drugRecordDTO.setDrugStart(drugRecord.getDrugStart());
        drugRecordDTO.setDrugEnd(drugRecord.getDrugEnd());
        drugRecordDTO.setDrugUnit(drugRecord.getDrugUnit());
        drugRecordDTO.setDrugTime(drugRecord.getDrugTime());
        drugRecordDTO.setHospitalName(drugRecord.getHospitalName());
        drugRecordDTO.setMedicinPerscripteur(drugRecord.getMedicinPerscripteur());
        drugRecordDTO.setPharmacyName(drugRecord.getPharmacyName());
        return  drugRecordDTO;
    }
}
