package day36_PracticeTasks.ScrumTask;

public class BusinessAnalyst extends Employee{
    public BusinessAnalyst(String name, int age, char gender, int id, double salary, String companyName) {
        super(name, age, gender, "BA", id, salary, companyName);
    }

    public void analyze(){
        System.out.println(name+" is analyzing the documents");
    }
}
