package day36_PracticeTasks.EmployeeTask;

public class EmployeeObjects {

    public static void main(String[] args) {

        Tester tester = new Tester();
        tester.setInfo("Alyssa",'F',26,11,"SDET",110000);

        tester.work();
        tester.testing();
        tester.creatingTicket();

        Developer developer = new Developer();
        developer.setInfo("Robert", 'M', 30, 45, "Senior Developer", 175000);

        developer.work();
        developer.coding();
        developer.fixingBugs();

        Teacher teacher = new Teacher();
        teacher.setInfo("Tatiana", 'F', 29, 22,"History Teacher", 90000);

        teacher.work();
        teacher.teaching();

        Driver driver = new Driver();
        driver.setInfo("Diana",'F', 31, 89, "Truck driver", 80000);

        driver.work();
        driver.driving();

        System.out.println(tester);
        System.out.println(developer);
        System.out.println(teacher);
        System.out.println(driver);






    }
}
