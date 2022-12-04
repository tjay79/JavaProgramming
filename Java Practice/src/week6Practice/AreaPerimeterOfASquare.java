package week6Practice;

import java.util.Scanner;

public class AreaPerimeterOfASquare {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter the side of a square");
        double side=scan.nextDouble();
        if (side<0){
            System.out.println("Invalid entry");
            System.exit(0);
        }
        double area=side*side;
        double perimeter=side*4;
        System.out.println("The perimeter of the square is: "+perimeter);
        System.out.println("The area of the square is: "+area);

        System.out.println("Would you like to calculate another square?");
        String answer=scan.next();
        while(!(answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("no"))){
            System.out.println("Invalid entry, please re-enter");
            answer=scan.next();
        }
        if(answer.equalsIgnoreCase("no")){
            System.out.println("Thank you for using Cydeo Square Calculator app");
        }else{
            System.out.println("Enter the side of a square");
            side=scan.nextDouble();
            if (side<0){
                System.out.println("Invalid entry");
                System.exit(0);
            }
            area=side*side;
            perimeter=side*4;
            System.out.println("The perimeter of the square is: "+perimeter);
            System.out.println("The area of the square is: "+area);
        }



    }
}
/*
Write a program that can calculate the area and perimeter of a
Square:
1. Ask the user "Enter the side of the
square:"
if user enters 0 or negative numbers,
terminate the program after displaying the error message "Invalid Entry
for the side of the square"
2. Display:
1. Area of square
2. Perimeter of square
3. Ask the user "Would you like to calculate
another Square?"
If "yes" --> repeat the
previous steps
If "No" --> Print "Thank you
for using Cydeo Square Calculator APP"
If user enters an invalid entry, ask
the user to re-enter until user provides a valid entry
 */
