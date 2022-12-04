package week6Practice;

import java.util.Scanner;

public class AreaPerimeterOfARectangle {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the length of the rectangle");
        double length=scan.nextDouble();
        while(!(length>=0)){
            System.err.println("Invalid entry for the length of the rectangle");
            System.exit(0);
        }
        System.out.println("Enter the width of the rectangle");
        double width=scan.nextDouble();
        while(!(width>=0)){
            System.out.println("Invalid width of the rectangle");
            System.exit(0);
        }
        double area=length*width;
        double perimeter=(2*width)+(2*length);
        System.out.println("The perimeter of the rectangle is: "+perimeter);
        System.out.println("The area of the rectangle is: "+area);
        System.out.println("Would you like to calculate another rectangle");
        String answer=scan.next();
        while(!(answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("no"))){
            System.err.println("Invalid entry, please re-enter");
            answer=scan.next();
        }
        if(answer.equalsIgnoreCase("no")){
            System.out.println("Thank you for using Cydeo Rectangle Calculator App");
        }else{
            System.out.println("Enter the length of the rectangle");
            length=scan.nextDouble();
            while(!(length>=0)){
                System.err.println("Invalid entry for the length of the rectangle");
                System.exit(0);
            }
            System.out.println("Enter the width of the rectangle");
            width=scan.nextDouble();
            while(!(width>=0)){
                System.out.println("Invalid width of the rectangle");
                System.exit(0);
            }
            area=length*width;
            perimeter=(2*width)+(2*length);
            System.out.println("The perimeter of the rectangle is: "+perimeter);
            System.out.println("The area of the rectangle is: "+area);
        }
        scan.close();


    }
}
/*
Write a program that can calculate the area and perimeter of a
Rectangle:
1. Ask the user "Enter the length of the
Rectangle:"
if user enters 0 or negative numbers,
terminate the program after displaying the error message "Invalid Entry
for the length of the rectangle"
2. Ask the user "Enter the width of the
Rectangle:"
if user enters 0 or negative numbers,
terminate the program after displaying the error message "Invalid Entry
for the width of the rectangle"
3. Display:
1. Area of rectangle
2. Perimeter of rectangle
4. Ask the user "Would you like to calculate
another Rectangle?"
If "yes" --> repeat the
previous steps
If "No" --> Print "Thank you
for using Cydeo Rectangle Calculator APP"
If user enters an invalid entry, ask
the user to re-enter until user provides a valid entry
 */
