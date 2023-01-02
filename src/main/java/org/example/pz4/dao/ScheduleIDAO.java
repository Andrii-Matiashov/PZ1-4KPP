package org.example.pz4.dao;

import org.example.pz4.entity.Schedule;

import java.util.List;

public interface ScheduleIDAO {
    List<Schedule> getAllSchedules();
    void saveSchedule(Schedule schedule);
    void deleteSchedule(long id);
    Schedule getSchedule(long id);
    List<Schedule> getSchedulesByDisciplineId(long id);
}
