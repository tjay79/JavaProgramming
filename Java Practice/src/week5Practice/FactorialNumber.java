package week5Practice;

import java.util.Scanner;

public class FactorialNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();

         int sum=1;

        for (int i =1; i <=num ; i++) {//i=2

         sum= sum*i;


        }
        System.out.println(sum);





    }
}
/*
Write a program that can return the factorial number of any given
number
Ex:
input: 5
output: 120
( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
 */