package org.example.pz4;

import org.example.pz4.dao.*;
import org.example.pz4.entity.Discipline;

public class Demo {
    public static void main(String[] args) {
        /*DisciplineIDAO disciplineIDAOMySQL = DAOFactory.getDisciplineDAOInstance(TypeDAO.MySQL);
        TeacherIDAO teacherIDAOMySQL = DAOFactory.getTeacherDAOInstance(TypeDAO.MySQL);
        ScheduleIDAO scheduleIDAOMySQL = DAOFactory.getScheduleDAOInstance(TypeDAO.MySQL); */
        DisciplineIDAO disciplineIDAOCollection = DAOFactory.getDisciplineDAOInstance(TypeDAO.COLLECTION);
        TeacherIDAO teacherIDAOCollection = DAOFactory.getTeacherDAOInstance(TypeDAO.COLLECTION);
        ScheduleIDAO scheduleIDAOCollection = DAOFactory.getScheduleDAOInstance(TypeDAO.COLLECTION);
        System.out.println("==============================");
        System.out.println("All disciplines: "+disciplineIDAOCollection.getAllDisciplines());
        System.out.println("All teachers: "+ teacherIDAOCollection.getAllTeachers());
        System.out.println("All schedules: "+scheduleIDAOCollection.getAllSchedules());
        System.out.println("==============================");
        teacherIDAOCollection.deleteTeacher(1);
        System.out.println("After delete teacher with id = 1: " + teacherIDAOCollection.getAllTeachers());
        System.out.println("==============================");

        Discipline discipline = disciplineIDAOCollection.getDiscipline(2);
        System.out.println("Before update discipline with id = 2: " + discipline);
        discipline.setHourPerSemester(100);
        disciplineIDAOCollection.saveDiscipline(discipline);
        System.out.println("After update discipline with id = 2 and hourPerSemester = 100: "+ disciplineIDAOCollection.getDiscipline(2));
        System.out.println("==============================");
    }
}
