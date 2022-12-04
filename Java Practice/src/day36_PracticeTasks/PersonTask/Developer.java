package day36_PracticeTasks.PersonTask;

public class Developer extends Employee{

    public Developer(String name, int age, char gender, int id, String jobTitle, double salary){
        super(name, age, gender, id, jobTitle, salary);
    }

    public void coding(){
        System.out.println(name+" is coding");
    }
}
