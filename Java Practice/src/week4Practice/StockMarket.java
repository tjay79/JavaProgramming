package week4Practice;

import java.util.Scanner;

public class StockMarket {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("How many stocks do you have?");
        int stocks = scan.nextInt();

        System.out.println("How much is your total value?");
        double value = scan.nextDouble();

        scan.nextLine();

        System.out.println("What is the name of the company you have most shares in?");
        String company = scan.nextLine();



        System.out.println("Your total stock market holding is $" + value +
                " which is made up of " + stocks +" shares. " + company + " is your company holdings");


        scan.close();


    }
}
/*
StockMarket task:
- Ask the user how many total shares they have already? (int)
-> If the user gives 0 or give a negative number none of the
rest condition should be executed
- Ask the user how much their total value in the stock market is
(double)
- Ask the user to enter the name of the company they have the
most shares in (String, multiple words)
- Print in the following format:
Ex:
inputs: 100, 25000, Apple INC
"Your total stock market holding is $25000 which is made up of
100 shares. Apple INC is your company holdings"
 */