package day18_NestedLoop;

import java.util.Scanner;

public class OddAndEven {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        while(true) {

            System.out.println("Enter a number:");
            int num = scan.nextInt();
            if(num%2==0){
                System.out.println("Number is even");
            }else{
                System.out.println("Number is odd");
            }

            System.out.println("Would you like to continue?");
            String a=scan.next();

            while(!(a.equals("yes")||a.equals("no"))){
                System.err.println("Invalid entry, please re-enter. Would you like to continue?");
                a=scan.next();
            }
            if(a.equals("no")){
                break;
            }


        }
    }
}
