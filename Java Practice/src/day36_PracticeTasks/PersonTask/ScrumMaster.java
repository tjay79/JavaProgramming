package day36_PracticeTasks.PersonTask;

public class ScrumMaster extends Employee{


    public ScrumMaster(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    public void teamMeeting(){
        System.out.println(name+" is in a meeting with the Scrum Team");
    }
}
