package day36_PracticeTasks.PersonTask;

public class ProductOwner extends Employee{

    public ProductOwner(String name, int age, char gender, int id, String jobTitle, double salary){
        super(name, age, gender, id, jobTitle, salary);
    }

    public void meetClient(){
        System.out.println(name+" is in a meeting with the Client");
    }
}
