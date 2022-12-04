package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your full name:");
        String name = input.nextLine();

        System.out.println("Please enter your building number:");
        String building = input.next();

        System.out.println("Please enter your street name:");
        String street = input.next();

        input.nextLine();

        System.out.println("Please enter your city");
        String city = input.nextLine();


        System.out.println("Please enter your state");
        String state = input.next();


        System.out.println("Please enter your zip code");
        String zipCode = input.next();

        System.out.println(name + "\n" + building + " " + street + "\n" + city + ", " + state + ".\n" + zipCode);



input.close();

    }
}
