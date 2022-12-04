package week4Practice;

public class AgeGroups {

    public static void main(String[] args) {

        int age = 156;

       String ageGroup = (age >=0 && age <=150)? (age <21)? "Teenager"
               : (age>=21 && age <55)? "Adult"
               : "Senior citizen" : "Invalid age";
        System.out.println(ageGroup);


    }
}
/*
Create a class called AgeGroups, write a program that can define the
age groups of a person
age groups are:
Teenager (< 21)
Adult   (>=21 && <55 )
Senior  ( >= 55 )
if age is negative or greater than 150, print invalid
NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT
STATEMENT
 */