package org.example.pz2;

import java.util.Comparator;

public class SortByDisciplineNameASC implements Comparator<Discipline> {
    @Override
    public int compare(Discipline o1, Discipline o2) {
        return o1.getDisciplineName().compareTo(o2.getDisciplineName());
    }
}
