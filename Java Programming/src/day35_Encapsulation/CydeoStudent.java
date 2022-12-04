package day35_Encapsulation;

public class CydeoStudent {

    public String name;
    public char gender;
    public int age;
    public int batchNumber;
    public int groupNumber;
    public static String schoolName;
    public String fieldOfStudy;
    public static String programmingLanguage;

    public static String secretCode;

    public CydeoStudent(String name, char gender, int age, int batchNumber, int groupNumber, String fieldOfStudy) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.fieldOfStudy = fieldOfStudy;
    }

    static{
        schoolName="Cydeo school";
        programmingLanguage="Java";
        secretCode="Wooden Spoon";
    }

    public void attendClass(){
        System.out.println(name+" is attending class");
    }
    public void study(){
        System.out.println(name+" is studying");
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", school=" + schoolName +
                ", programming language=" + programmingLanguage +
                ", groupNumber=" + groupNumber +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                '}';
    }

    public static void printSchoolName(){
        System.out.println("School name: "+schoolName);
    }
    public static void secretCode(){
        System.out.println("Secret code: "+secretCode);
    }
}
