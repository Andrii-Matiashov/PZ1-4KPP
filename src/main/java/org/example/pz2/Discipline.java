package org.example.pz2;

import java.util.Objects;

public class Discipline {
    private String disciplineName;
    private int hourPerSemester;

    public Discipline() {
    }

    public Discipline(String disciplineName, int hourPerSemester) {
        this.disciplineName = disciplineName;
        this.hourPerSemester = hourPerSemester;
    }

    @Override
    public String toString() {
        return "Discipline{" +
                "disciplineName='" + disciplineName + '\'' +
                ", hourPerSemester=" + hourPerSemester +
                '}';
    }

    public String getDisciplineName() {
        return disciplineName;
    }

    public void setDisciplineName(String disciplineName) {
        this.disciplineName = disciplineName;
    }

    public int getHourPerSemester() {
        return hourPerSemester;
    }

    public void setHourPerSemester(int hourPerSemester) {
        this.hourPerSemester = hourPerSemester;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Discipline that)) return false;
        return getHourPerSemester() == that.getHourPerSemester() && Objects.equals(getDisciplineName(), that.getDisciplineName());
    }
}
