package day36_PracticeTasks.ScrumTask;

public class ScrumMaster extends Employee{


    public ScrumMaster(String name, int age, char gender, int id, double salary, String companyName) {
        super(name, age, gender, "Scrum Master", id, salary, companyName);
    }

    public void startSprint(){
        System.out.println(name+" is start the Sprint");
    }
}