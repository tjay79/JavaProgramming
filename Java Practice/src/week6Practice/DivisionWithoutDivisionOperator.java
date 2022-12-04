package week6Practice;

public class DivisionWithoutDivisionOperator {

    public static void main(String[] args) {

        int num1 = 7;
        int num2 = 20;
        int howMany =0;
        int result=num1;
        int remainder=0;

        while(result<=num2){
            result += num1;
            howMany++;
        }
        remainder = num2-howMany*num1;
        System.out.println("There are " + howMany + " times " + num2 + " in " + num1 + " and the remeinder is " + remainder + ".");






    }
}
/*
Write a program that can divide two positive numbers without
using / (division) and * (multiplication) operators.
 */
