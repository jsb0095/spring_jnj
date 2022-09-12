package com.example.jnj.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter@Setter
@Table(name = "alarm")
public class Alarm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long aId;
    private Long mId;
    private Long drId;
    private LocalDateTime alarmStart;
    private boolean alarmCheck;

    public static Alarm save(Long drId, LocalDateTime drugTime) {
        Alarm alarm = new Alarm();
        alarm.setDrId(drId);
        alarm.setAlarmStart(drugTime);
        alarm.setAlarmCheck(false);
        return alarm;
    }

    public static Alarm update(Alarm alarm) {
        Alarm alarm2 = new Alarm();
        alarm.setAId(alarm.getAId());
        alarm.setDrId(alarm.getDrId());
        alarm.setAlarmStart(alarm.getAlarmStart());
        alarm.setAlarmCheck(alarm.isAlarmCheck());
        return alarm2;
    }
}
