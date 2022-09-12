package com.example.jnj.entity;
import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;

@Entity
@Getter@Setter
@Table(name = "drug_main")
public class DrugMain {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long dmId;
    private String drugImageName;
    private String productName;
    private String companyName;
    private int drugCode;
    private int classiFication;
    private String effect;
    private String drugUse;
    private String drugCount;
    private String precautions;


}
