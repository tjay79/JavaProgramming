package day12_Scanner;

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your hourly rate:");
        int hourlyRate = scan.nextInt();

        System.out.println("Please enter your weekly hours:");
        int weeklyHours = scan.nextInt();

        System.out.println("Please enter the state tax rate");
        double stateTax = scan.nextDouble();

        System.out.println("Please enter the federal tax rate");
        double federalTax = scan.nextDouble();

        int totalSalary = hourlyRate*weeklyHours*52;
        double totalState = totalSalary*stateTax/100;
        double totalFed = totalSalary * federalTax / 100;
        double totalTax = totalState+totalFed;
        double netIncome = totalSalary-totalTax;

        System.out.println(totalSalary);
        System.out.println(totalState);
        System.out.println(totalFed);
        System.out.println(totalTax);
        System.out.println(netIncome);

        scan.close();


    }
}
