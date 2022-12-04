package day14_String;

import java.util.Scanner;

public class EmailDomain_Substring {

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);

        System.out.println("Please enter your email");
        String email=scan.next();

        String domain=email.substring(email.indexOf("@")+1,email.lastIndexOf("."));

        System.out.println("domain = " + domain);


    }
}
