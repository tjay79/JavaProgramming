package week6Practice;

import java.util.Scanner;

public class AreaPerimeterOfCircle {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        double radius = scan.nextDouble();
        if (!(radius >= 0)) {
            System.out.println("Invalid entry");
            System.exit(0);
        }
        double perimeter = 2 * radius * 3.14;
        double area = 3.14 * (radius * radius);
        double diameter = 2 * radius;
        System.out.println("Diameter of the circle is: " + diameter);
        System.out.println("Area of the circle is: " + area);
        System.out.println("Perimeter of the circle is: " + perimeter);

        System.out.println("Would you like to calculate another circle?");
        String answer = scan.next();
        answer = answer.toLowerCase();
        while (!(answer.equals("yes") || answer.equals("no"))) {
            System.out.println("Invalid entry, please re-enter");
            answer = scan.next();
            answer = answer.toLowerCase();
        }
        if (answer.equals("no")) {
            System.out.println("Thank you for using Cydeo Circle Calculator app");
        } else {
            System.out.println("Enter the radius of the circle");
            radius = scan.nextDouble();
            if (!(radius >= 0)) {
                System.out.println("Invalid entry");
                System.exit(0);
            }
            perimeter = 2 * radius * 3.14;
            area = 3.14 * (radius * radius);
            diameter = 2 * radius;
                System.out.println("Diameter of the circle is: " + diameter);
                System.out.println("Area of the circle is: " + area);
                System.out.println("Perimeter of the circle is: " + perimeter);




        }
    }
}
/*
Write a program that can calculate the area and perimeter of a
circle:
1. Ask the user "Enter the radius of the
circle:"
if user enters 0 or negative numbers,
terminate the program after displaying the error message "Invalid Entry
for the radius of the circle"
2. Display:
1. Diameter of circle
2. Area of circle
3. Perimeter of circle
3. Ask the user "Would you like to calculate
another circle?"
If "yes" --> repeat the
previous steps
If "No" --> Print "Thank you
for using Cydeo Circle Calculator APP"
If user enters an invalid entry, ask
the user to re-enter until user provides a valid entry
 */