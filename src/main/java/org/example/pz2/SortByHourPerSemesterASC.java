package org.example.pz2;

import java.util.Comparator;

public class SortByHourPerSemesterASC implements Comparator<Discipline> {
    @Override
    public int compare(Discipline o1, Discipline o2) {
        return o1.getHourPerSemester()-o2.getHourPerSemester();
    }
}
