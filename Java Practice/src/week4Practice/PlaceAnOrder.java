package week4Practice;

import java.util.Scanner;

public class PlaceAnOrder {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the product name:");
        String product = scan.next();

        System.out.println("Please enter the price:");
        double price = scan.nextDouble();

        System.out.println("Please enter the quantity:");
        int quantity = scan.nextInt();

        System.out.println("Please enter your first name:");
        String name = scan.next();

        double total = price * quantity;


        System.out.println(name + ", your order for " + quantity + " " + product + " has been placed. Your total is $" + total);

        scan.close();

    }
}
/*
PlaceAnOrder task:
Ask User to enter the prodcut name (multiple words)
Ask the user to enter the price  (double)
Ask the user to enter the quantity (int)
Ask the user to enter their first name (String, single
word)
Print in the following format:
Ex:
Input: "Apples" , 1.5, 5. "Luke"
Output:
Luke, your order for 5 Apples has been places.
Your total is 7.5.
 */