package week5Practice;

import java.util.Scanner;

public class AccountNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter account number");
        String account = scan.next();
        String valid = account.substring(0,1);
        boolean good = valid.equals("2")&&account.length()==7;
        boolean good2 = valid.equals("5")&& account.length()==10;

        if(good||good2){
            System.out.println("Account number is valid");
        }else{
            System.out.println("Invalid account number");
        }
        scan.close();




    }
}
/*
Create a class called AccountNumber.
Ask the user enter an account number (String). Check if these
account number is valid.
> If the account number begins with a â2â the account
number should be 7 characters long
> If the account number begins with a â5â the account
number should be 10 characters long
â> If the account number does not begin with a 2 or a 5 OR
the account number lengths
do not meet the expected results print âInvalid
account numberâ
 */