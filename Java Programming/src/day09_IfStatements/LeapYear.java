package day09_IfStatements;

public class LeapYear {

    public static void main(String[] args) {

        int year = 2020;

        boolean leapYear = year % 4 ==0;

        if(leapYear){
            System.out.println(year + " is a leap year: true");
        }else{
            System.out.println(year + " is not a leap year: false");
        }





    }
}
/*
create a class named LeapYear, and write a program that can
identify if the given year is leap Year, print true if it's leap year,
otherwise print false
        Ex:
             if  year = 2020
            output:
                2020 is leap year: true
Hint: if the number of year can be evenly divisible by 4 (with
remainder of zero), it's leap year
 */