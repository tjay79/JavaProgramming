package week5Practice;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter username");
        String username = scan.next();
        System.out.println("Enter password");
        String password = scan.next();
        boolean u1 = username.equals("Cydeo")==true;
        boolean p1 = password.equals("WoodenSpoon")==true;

        if(u1&&p1){
            System.out.println("Logged in");
        }else{
            System.out.println("Incorrect username or password");
        }





    }
}
/*
You are writing a code for the log-in function of the Cybertek
Application, assume that your credentials are:
username: Cydeo
password: WoodenSpoon
Ask the user to enter their credentials. If credentials are
matched, your program should print "Logged in."
otherwise print "Incorrect username or password" as error message
Hints: In order to login, both username and password MUST
be correct
you will need to use equals() method
 */