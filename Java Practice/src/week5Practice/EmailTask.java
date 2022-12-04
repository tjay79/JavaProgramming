package week5Practice;

import java.util.Scanner;

public class EmailTask {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an email");
        String email = scan.next();

        String first = email.substring(0,email.indexOf("_"));
        String last = email.substring(email.indexOf("_")+1,email.indexOf("@"));
        String upper = first.substring(0,1).toUpperCase() + first.substring(1);
        String upper2 = last.substring(0,1).toUpperCase() + last.substring(1);
        String domain=email.substring(email.indexOf("@")+1,email.indexOf("."));

        System.out.println("First name: " + upper + "\nLast name: " + upper2 + "\nDomain: "+domain);






    }
}
/*
Create a class called EmailTask2.
Assume that email address is constructed by person's first name and
followed by an underscore and last name.
Write a program that will print out information about user based on
email. Print first name, last name, and domain.
First and Last name should be printed with proper format -
uppercase first letter and remaining lowercase.
Ex:
input:
craig_federighi@apple.com
Output:
First name: Craig
Last name: Federighi
Domain: apple
 */