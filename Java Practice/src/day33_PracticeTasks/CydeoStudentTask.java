package day33_PracticeTasks;

public class CydeoStudentTask {

    public String name;
    public int age;
    public char gender;
    public int id;
    public char grade;
    public String batchNumber;
    public String groupNumber;
    public static String schoolName="Cydeo School";

    public static String programmingLanguage="Java";

    public CydeoStudentTask(String name, int age, char gender, int id, char grade, String batchNumber, String groupNumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
        this.grade = grade;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }

    public String toString() {
        return "CydeoStudentTask{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id=" + id +
                ", grade=" + grade +
                ", batchNumber='" + batchNumber + '\'' +
                ", groupNumber='" + groupNumber + '\'' +
                '}';
    }

    public void study(){
        System.out.println(name+" is studying");
    }

    public void attendClass(){
        System.out.println(name+" is attending class");
    }

    public static void printSchoolName(){
        System.out.println(schoolName);
    }

    public static void printProgrammingLanguage(){
        System.out.println(programmingLanguage);
    }



}
/*
CydeoStudent Task
1. Create a class named CydeoStudent:
Attributes:
instances: name, age,
gender, id, grade, batchNumber, groupNumber
statics: schoolName,
programmingLanguage
Add a constructor that can set All the
fields (instances)
Actions:
study()
attendClass()
printSchoolName(): displays
the school name
printProgLanguage():
displays the name of programming language
toString()
 */
