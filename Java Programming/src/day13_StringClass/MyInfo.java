package day13_StringClass;

import java.util.Scanner;

public class MyInfo {

    public static void main(String[] args) {

        Scanner info = new Scanner(System.in);

        System.out.println("Please enter your age");
        int age = info.nextInt();
        System.out.println("Please enter your gender");
        String gender = info.next();
        info.nextLine();
        System.out.println("Please enter your full name");
        String name = info.nextLine();
        System.out.println("Please enter your phone number");;
        long phone = info.nextLong();
        System.out.println("Please enter your zip code");
        int zipCode = info.nextInt();
        info.nextLine();
        System.out.println("Please enter your school name");
        String school= info.nextLine();
        System.out.println("Please enter your city");
        String city = info.nextLine();
        System.out.println("Please enter your state");
        String state = info.next();
        System.out.println("Please enter your building number");
        int building = info.nextInt();
        info.nextLine();
        System.out.println("Please enter your street");
        String street = info.nextLine();

        System.out.println(name + "\n" + age + "\n" + gender + "\n" + phone + "\n\t" + building + " " + street + "\n\t" + city
        + ", " + state + " " + zipCode + "\n" + school);

        info.close();


    }
}
