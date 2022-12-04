package day35_Encapsulation.encapsulation;

public class Employee {

    private String name;
    private char gender;
    private int age;
    private double salary;

    public String getName(){
        return name;
    }
    public char getGender(){
        return gender;
    }
    public int getAge(){
        return age;
    }
    public double getSalary(){
        return salary;
    }

    public void setName(String name){
        if(name.isBlank()||name.isEmpty()){
            System.err.println("Invalid name: "+name);
            System.exit(0);
        }
        this.name=name;
    }
    public void setGender(char gender){
        if(!(gender=='F'||gender=='M')){
            System.err.println("Incorrect gender: "+gender);
            System.exit(0);
        }
        this.gender=gender;
    }
    public void setAge(int age){
        if(age<16||age>90){
            System.err.println("Invalid age: "+age);
            System.exit(0);
        }
        this.age=age;
    }
    public void setSalary(double salary){
        if(salary<=0){
            System.err.println("Invalid salary: "+salary);
            System.exit(0);
        }
        this.salary=salary;
    }

    public Employee(String name, char gender, int age, double salary) {
        setName(name);
        setGender(gender);
        setAge(age);
        setSalary(salary);
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
