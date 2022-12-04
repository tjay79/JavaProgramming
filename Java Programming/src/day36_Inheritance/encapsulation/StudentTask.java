package day36_Inheritance.encapsulation;

public class StudentTask {


    private String name;
    private int age;
    private char gender;
    private char grade;
    public String schoolName;


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public char getGrade() {
        return grade;
    }

    public String getSchoolName(){
        return schoolName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 5 || age > 90) {
            System.err.println("Invalid age");
            return;
        }
        this.age = age;
    }

    public void setGender(char gender) {
        if (!(gender == 'M' || gender == 'F')) {
            System.err.println("Invalid gender");
            return;
        }
        this.gender = gender;
    }

    public void setGrade(char grade) {
        if (grade < 'A' || grade > 'F' || grade == 'E') {
            System.err.println("Invalid grade");
            return;
        }
        this.grade = grade;
    }

    public void setSchoolName(String schoolName){
        this.schoolName=schoolName;
    }

    public StudentTask(String name, int age, char gender, char grade, String schoolName) {
        setName(name);
        setAge(age);
        setGender(gender);
        setGrade(grade);
        setSchoolName(schoolName);
    }

    public void study(){
        System.out.println(name+ " is studying");
    }

    public String toString() {
        return "StudentTask{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", grade=" + grade +
                ", school name=" + schoolName +
                '}';
    }
}



