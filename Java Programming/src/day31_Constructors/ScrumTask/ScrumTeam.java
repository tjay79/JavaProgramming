package day31_Constructors.ScrumTask;

import utilities.ArraysUtilities;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    public String PO, BA, SM;
    public ArrayList<Tester> testersList=new ArrayList<>();
    public ArrayList<Developer> developersList= new ArrayList<>();
    public int dayOfSprint;


    public ScrumTeam(String PO, String BA, String SM, int dayOfSprint) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
        this.dayOfSprint = dayOfSprint;
    }

    public void addTester(Tester tester){
        testersList.add(tester);
    }
    public void addTesters(Tester[] testers){
        testersList.addAll(Arrays.asList(testers));
    }
    public void addDeveloper(Developer developer){
        developersList.add(developer);
    }
    public void addDevelopers(Developer[] developers){
        developersList.addAll(Arrays.asList(developers));
    }
    public void removeTester(int employeeId){
        testersList.removeIf(p->p.employeeId==employeeId);
    }
    public void removeDeveloper(int employeeId){
        developersList.removeIf(p->p.employeeId==employeeId);
    }


    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", total number of testers=" + testersList.size() +
                ", total number of developers=" + developersList.size() +
                ", dayOfSprint=" + dayOfSprint +
                '}';
    }
}
