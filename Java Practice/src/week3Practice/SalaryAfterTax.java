package week3Practice;

public class SalaryAfterTax {

    public static void main(String[] args) {

        int salary = 100000;
        boolean married = false;

        double taxRate;


        if(salary>=130000){
            taxRate = 0.35;
        }else if(salary>=100000){
            taxRate = 0.30;
        }else if(salary >=80000){
            taxRate = 0.25;
        }else{
            taxRate = 0.20;
        }

        if(married){
            taxRate -= 0.05;
        }
        double salaryAfterTax = salary - (salary*taxRate);
        System.out.println(salaryAfterTax);


    }
}
