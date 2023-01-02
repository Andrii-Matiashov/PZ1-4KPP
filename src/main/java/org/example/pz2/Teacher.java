package org.example.pz2;

public class Teacher extends Discipline{
    private String surname;
    private String name;
    private String fatherName;
    private String email;
    private String phone;

    public Teacher(String surname, String name, String fatherName, String email, String phone) {
        this.surname = surname;
        this.name = name;
        this.fatherName = fatherName;
        this.email = email;
        this.phone = phone;
    }

    public Teacher(String disciplineName, int hourPerSemester, String surname, String name, String fatherName, String email, String phone) {
        super(disciplineName, hourPerSemester);
        this.surname = surname;
        this.name = name;
        this.fatherName = fatherName;
        this.email = email;
        this.phone = phone;
    }

    public Teacher() {
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", disciplineName='" + getDisciplineName() + '\'' +
                ", hourPerSemester='" + getHourPerSemester() + '\'' +
                '}';
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
