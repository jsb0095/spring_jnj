package com.example.jnj.controller;

import com.example.jnj.dto.DrugMainDTO;
import com.example.jnj.dto.DrugRecordDTO;
import com.example.jnj.service.DrugMainService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/drug/main")
public class DrugController {
   final private DrugMainService drugMainService;
    @GetMapping("/search")
    public List<DrugMainDTO> SearchDrugName(@RequestParam("q")String q) {
        List<DrugMainDTO> drugMainDTOS = drugMainService.SearchDrugName(q);
        return drugMainDTOS;
    }
}
