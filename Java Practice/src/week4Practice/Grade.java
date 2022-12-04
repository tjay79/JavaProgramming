package week4Practice;

public class Grade {

    public static void main(String[] args) {

        char grade = 'G';

       String gradeName =  (grade >='A' && grade <='F')? (grade=='A')? "Excellent" : (grade=='B')? "Great job" : (grade=='C')? "Good"
                : (grade=='D')? "Passed" : "Failed" : "Invalid grade";

        System.out.println(gradeName);


    }
}
/*
Create a class called Grade, a char variable named grade is given.
write a program to print the following messages:
'A': excellent
'B': great job
'C': good
'D': passed
'F': failed
other wise: invalid
NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT
STATEMENT
 */