package day36_PracticeTasks.EmployeeTask;

public class Employee {

    public String name;
    public char gender;
    public int age;
    public int id;
    public String jobTitle;
    public double salary;

    public void setInfo(String name, char gender, int age, int id, String jobTitle, double salary) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }

    public void work(){
        System.out.println(name+" is working");
    }
}
