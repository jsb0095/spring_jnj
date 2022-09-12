package com.example.jnj.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AlarmDTO {
    private Long aId;
    private Long mId;
    private Long drId;
    private LocalDateTime alarmStart;
    private boolean alarmCheck;
}
