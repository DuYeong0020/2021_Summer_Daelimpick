package com.ducon.daelimpick.schedule;

import lombok.Getter;

@Getter
public class Schedule {
    private Long ScheduleId; // 스케쥴 Id
    private String userId; // 유저 Id
    private int day; // 일요일 : 0 ~ 토요일 : 6
    private String className; // 일정 제목
    private String classTime; // 강의실
    private String startTime; // 시작 시간
    private String endTime; // 끝나는 시간
}
