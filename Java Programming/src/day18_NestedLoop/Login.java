package day18_NestedLoop;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter your username:");
        String u= scan.next();
        System.out.println("Enter your password");
        String p=scan.next();

        if(u.equals("Cydeo")&&p.equals("WoodenSpoon")){

            System.out.println("You are logged in");
        }else{
            for (int i = 1; i <=3 ; i++) {

                System.err.println("Incorrect username or password!");
                System.out.println("Enter your username:");
                u=scan.next();
                System.out.println("Enter your password:");
                p=scan.next();
                if(u.equals("Cydeo")&&p.equals("WoodenSpoon")){
                    System.out.println("You are logged in");
                    break;
                }

            }
            if(!(u.equals("Cydeo")&&p.equals("WoodenSpoon"))){
                System.err.println(("Your account is locked, please contact support team"));
            }
        }




    }
}
