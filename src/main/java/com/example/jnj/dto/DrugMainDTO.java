package com.example.jnj.dto;

import com.example.jnj.entity.DrugMain;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DrugMainDTO {
    private Long dmId; //약 관리번호
    private String drugImageName;// 약 사진
    private String productName;// 상풍명
    private String companyName;// 제약회사
    private int drugCode;// 품목코드
    private int classiFication;// 분류번호
    private String effect;// 효과
    private String usage;// 용법
    private String volume;// 용량
    private String precautions;//주의사항

    public static DrugMainDTO findDrugName(DrugMain drugMain) {
        DrugMainDTO drugMainDTO = new DrugMainDTO();
        drugMainDTO.setDmId(drugMain.getDmId());
        drugMainDTO.setDrugImageName(drugMain.getDrugImageName());
        drugMainDTO.setProductName(drugMain.getProductName());
        drugMainDTO.setCompanyName(drugMain.getCompanyName());
        drugMainDTO.setDrugCode(drugMain.getDrugCode());
        drugMainDTO.setClassiFication(drugMain.getDrugCode());
        drugMainDTO.setEffect(drugMain.getEffect());
        drugMainDTO.setUsage(drugMain.getDrugUse());
        drugMainDTO.setVolume(drugMain.getDrugCount());
        drugMainDTO.setPrecautions(drugMain.getPrecautions());
        return  drugMainDTO;
    }
}
