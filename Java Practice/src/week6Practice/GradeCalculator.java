package week6Practice;

import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your score");
        int grade=scan.nextInt();
        if(!(grade>=0&&grade<=100)){
            System.out.println("Invalid entry");
            System.exit(0);
        }
        String letter="";
        letter=(grade<=100&&grade>=90)? "A" :(grade<=89&&grade>=80)?"B":(grade<=79&&grade>=70)?"C":(grade<=69&&grade>=60)?"D":"F";
        System.out.println(letter);
        System.out.println("Would you like to continue?");
        String answer=scan.next();
        if(!(answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("no"))){
            System.out.println("Invalid entry");
            System.exit(0);
        }else{
            System.out.println("Enter your score");
            grade=scan.nextInt();
            if(!(grade>=0&&grade<=100)){
                System.out.println("Invalid entry");
                System.exit(0);
            }
            letter=(grade<=100&&grade>=90)? "A" :(grade<=89&&grade>=80)?"B":(grade<=79&&grade>=70)?"C":(grade<=69&&grade>=60)?"D":"F";
            System.out.println(letter);
        }


    }
}
/*
Write a program for grade calculator:
1. Ask the user "Enter your score"
If user enters invalid score, terminate
the program after displaying the error message "Invalid Entry"
 2. Display the grade of the student.
 90 ~ 100 ==> A
 80 ~ 89 ==> B
 70 ~ 79 ==> C
 60 ~ 69 ==> D
 0 ~ 59 ==> F
2. Ask the user would you like to continue
If "yes" --> repeat the previous steps
If "no" --> print "Thank you for using
Cydeo Grade Calculator APP"
If user enters an invalid entry,
terminate the program after displaying the error message "Invalid Entry"
 */
