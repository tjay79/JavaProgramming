package week5Practice;

import java.util.Scanner;

public class Initials {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first name");
        String firstName = scan.next();
        System.out.println("Enter your last name");
        String lastName = scan.next();
        String f1 = firstName.toUpperCase();
        char first= firstName.charAt(0);
        String l1 = lastName.toUpperCase();
        char last = l1.charAt(0);

        System.out.println(first + "." + last);





    }
}
/*
write a program that can return the initials of the user
ex:
cybertek
school
output:
C.S
Note: Pay attention to the example output
 */