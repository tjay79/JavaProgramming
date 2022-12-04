package week11_11_19_2022.CustomClass;

import java.time.LocalDate;

public class Student {

    public String name;
    public char gender;

    public char grade;
    public LocalDate dateOfBirth;
    public int age, studentId;

    public Student(String name, char gender,char grade, LocalDate dateOfBirth, int studentId) {
        this.name = name;
        this.gender = gender;
        this.grade=grade;
        this.dateOfBirth = dateOfBirth;
        this.studentId = studentId;
        this.age=LocalDate.now().getYear()- dateOfBirth.getYear();
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", grade=" + grade +
                ", dateOfBirth=" + dateOfBirth +
                ", studentId=" + studentId +
                ", age=" + age +
                '}';
    }
}
