package day30_CustomClass;

public class CapitalOne {

    public static void main(String[] args) {

        Employee employee1= new Employee();
        Employee employee2= new Employee();
        Employee employee3= new Employee();
        Employee employee4= new Employee();
        Employee employee5= new Employee();

        employee1.setInfo("Anthony",4561,'M',"SDET",150000, true);
        employee2.setInfo("Ben", 4562, 'M', "COO",200000,true);
        employee3.setInfo("Alexandra", 4563, 'F', "Dev",175000, false);
        employee4.setInfo("Maria", 4564, 'F', "Scrum Master", 190000, true);
        employee5.setInfo("Diana", 4565, 'F',"Product Owner", 290000, true);

        Employee[] employees={employee1, employee2, employee3, employee4, employee5};

        int fullTime=0;
        int partTime=0;
        double max=employees[0].salary;
        double min=employees[0].salary;
        for (Employee employee : employees) {
            if(employee.isFullTime){
                fullTime++;
            }else{
                partTime++;
            }
            if(employee.salary>max){
                max=employee.salary;
            }
            if(employee.salary<min){
                min=employee.salary;
            }
        }

        System.out.println("fullTime = " + fullTime);
        System.out.println("partTime = " + partTime);

        System.out.println("max = " + max);
        System.out.println("min = " + min);


    }
}
