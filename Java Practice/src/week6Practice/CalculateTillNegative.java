package week6Practice;

import java.util.Scanner;

public class CalculateTillNegative {

    public static void main(String[] args) {

        Scanner  scan = new Scanner(System.in);

        System.out.println("Enter a number");
        int num1=scan.nextInt();
        System.out.println("Enter a second number");
        int num2=scan.nextInt();
        int result=num1+num2;


            System.out.println(result);
            while(num1>0&& num2>0){

            System.out.println("Enter a number");
            num1=scan.nextInt();
            System.out.println("Enter a second number");
            num2=scan.nextInt();
                result=num1+num2;
                if(num1>0&&num2>0){
                    System.out.println(result);
                }else{
                    System.out.println("Negative number is invalid");
                }





        }








    }
}
/*
Write a program that calculates the sum of numbers entered by the
user until user enters a negative number.
hint: you need an infinite loop
 */
