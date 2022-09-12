package com.example.jnj.entity;

import com.example.jnj.dto.DrugRecordDTO;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter@Setter
@Table(name = "drug_record")
public class DrugRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long drId;
    private Long rxId;
    private Long memberId;
    private Long familyId;
    private String disease;
    private String drugName;
    private LocalDateTime drugStart;
    private LocalDateTime drugEnd;
    private String drugUnit;
    private LocalDateTime drugTime;
    private String hospitalName;
    private String medicinPerscripteur;
    private String pharmacyName;


    public static DrugRecord toSave(DrugRecordDTO drugRecordDTO) {
        DrugRecord drugRecord =new DrugRecord();
        drugRecord.setRxId(drugRecordDTO.getRxId());
        drugRecord.setMemberId(drugRecordDTO.getMemberId());
        drugRecord.setFamilyId(drugRecordDTO.getFamilyId());
        drugRecord.setDisease(drugRecordDTO.getDisease());
        drugRecord.setDrugName(drugRecordDTO.getDrugName());
        drugRecord.setDrugName(drugRecordDTO.getDrugName());
        drugRecord.setDrugStart(drugRecordDTO.getDrugStart());
        drugRecord.setDrugEnd(drugRecordDTO.getDrugEnd());
        drugRecord.setDrugUnit(drugRecordDTO.getDrugUnit());
        drugRecord.setDrugTime(drugRecordDTO.getDrugTime());
        drugRecord.setHospitalName(drugRecordDTO.getHospitalName());
        drugRecord.setMedicinPerscripteur(drugRecordDTO.getMedicinPerscripteur());
        drugRecord.setPharmacyName(drugRecordDTO.getPharmacyName());
        return  drugRecord;
    }


}
