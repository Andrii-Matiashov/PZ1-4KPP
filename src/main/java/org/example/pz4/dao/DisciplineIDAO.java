package org.example.pz4.dao;


import org.example.pz4.entity.Discipline;

import java.util.List;

public interface DisciplineIDAO {
    List<Discipline> getAllDisciplines();
    void saveDiscipline(Discipline discipline);
    Discipline getDiscipline(long id);
    void deleteDiscipline(long id);
}
