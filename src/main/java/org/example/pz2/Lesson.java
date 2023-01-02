package org.example.pz2;

public class Lesson extends Teacher{
    private String startDateTime;
    private String endDateTime;

    public Lesson(String disciplineName, int hourPerSemester, String surname, String name, String fatherName, String email, String phone, String startDateTime, String endDateTime) {
        super(disciplineName, hourPerSemester, surname, name, fatherName, email, phone);
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
    }

    public Lesson() {
    }

    public String getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(String startDateTime) {
        this.startDateTime = startDateTime;
    }

    public String getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(String endDateTime) {
        this.endDateTime = endDateTime;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "surname='" + getSurname()+ '\'' +
                ", name='" + getName() + '\'' +
                ", fatherName='" + getFatherName() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", phone='" + getPhone() + '\'' +
                ", disciplineName='" + getDisciplineName() + '\'' +
                ", hourPerSemester='" + getHourPerSemester() + '\'' +
                ", startDateTime='" + startDateTime + '\'' +
                ", endDateTime='" + endDateTime + '\'' +
                '}';
    }
}
