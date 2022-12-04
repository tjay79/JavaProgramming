package week5Practice;

import java.util.Scanner;

public class EmailSwap {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an email");
        String email = scan.next();


        String first = email.substring(0, email.indexOf("_"));
        String last = email.substring(email.indexOf("_")+1,email.indexOf("@"));
        String rest= email.substring(email.indexOf("@"));

        email= last +"_"+ first + rest;
        System.out.println(email);





        scan.close();





    }
}
