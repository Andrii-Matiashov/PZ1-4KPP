package org.example.pz4.dao;

import org.example.pz4.entity.Teacher;

import java.util.List;

public interface TeacherIDAO {
    List<Teacher> getAllTeachers();
    List<Teacher> getTeachersBySurname(String surname);
    Teacher getTeacher(long id);
    void saveTeacher(Teacher teacher);
    void deleteTeacher(long id);
    List<Teacher> getTeachersByDisciplineId(long id);
}
