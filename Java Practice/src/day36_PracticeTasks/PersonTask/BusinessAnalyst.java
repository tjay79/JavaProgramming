package day36_PracticeTasks.PersonTask;

public class BusinessAnalyst extends Employee{

    public BusinessAnalyst(String name, int age, char gender, int id, String jobTitle, double salary){
        super(name, age, gender, id, jobTitle, salary);
    }

    public void meeting(){
        System.out.println(name+" is in a meeting with the Scrum Team");
    }
}
