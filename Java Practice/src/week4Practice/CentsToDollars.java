package week4Practice;

import java.util.Scanner;

public class CentsToDollars {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter cents");
        int cents = scan.nextInt();

        int dollars= cents /100;
        int dollarsRest = cents%  100;

        System.out.println(cents + " cents equal to: " + dollars + " dollars and " + dollarsRest + " cents");

        scan.close();



    }
}
/*
Write a program that can convert cents to dollars, if there is any
remainder include them in the result as cents
Ex:
Enter cents
225
output:
225 cents equal to: 2 dollars and 25 cents
 */