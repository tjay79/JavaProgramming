package day35_PracticeTasks.ScrumTask;

public class Developers {
    private String name;
    private int employeeId;
    private String jobTitle;
    private double salary;

    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeId(int employeeId) {
        if(employeeId<=0){
            System.out.println("Invalid employee Id");
            return;
        }
        this.employeeId = employeeId;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setSalary(double salary) {
        if(salary<=0){
            System.out.println("Invalid salary");
            return;
        }
        this.salary = salary;
    }

    public Developers(String name, int employeeId, String jobTitle, double salary) {
        setName(name);
        setEmployeeId(employeeId);
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public String toString() {
        return "Developers{" +
                "name='" + name + '\'' +
                ", employeeId=" + employeeId +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
