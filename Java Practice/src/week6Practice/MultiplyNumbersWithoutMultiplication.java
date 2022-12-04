package week6Practice;

import java.util.Scanner;

public class MultiplyNumbersWithoutMultiplication {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter first number");;
        double num1=scan.nextDouble();
        System.out.println("Enter second number");
        double num2=scan.nextDouble();
        double result=0;


        for (int i = 1; i<=num2 ; i++) {

            result=result+num1;

        }
        System.out.println(result);



    }
}
/*
Write a program that asks user to enter two positive numbers,
then multiply those two numbers without using multiplication (*)
operator.
if user enters any negative numbers, print Invalid
Ex:
inputs:
10
20
output:
200
 */
