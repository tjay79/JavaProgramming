package week5Practice;

import java.util.Scanner;

public class TipCalculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Split or nop split");
        String split = scan.nextLine();
        System.out.println("Number of people entered:");
        int people = scan.nextInt();
        System.out.println("Enter check amount:");
        double check = scan.nextDouble();
        System.out.println("How was the service quality:");
        String service = scan.next();

       double tipRate = (service.equals("Poor")? 0.05 : (service.equals("Fair") ? 0.10 : (service.equals("Good") ? 0.15
                :service.equals("Great")?0.20:0.25)));
       double tipPay= check*tipRate;
       if(split.equals("Yes")){
           System.out.println("Number of people entered: " + people + "\nTotal to pay: " + check + "\nTotal tip: " +
                   tipPay + "\nTotal per person: " + (check/people) + "\nTip per person" + (tipPay/people));

       }else{
           System.out.println("Number of people entered: " + people + "\nTotal to pay: " + check + "\nTotal tip: " +
                   tipPay);
       }





    }
}
/*
Create a class called TipCalculator, write a program for a tip
calculator.
There will be different service quality benchmarks that will determine the
tip given.
There will also the ability to calculate based on the number of people in
the party and if there is a split of the bill or not.
Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent
= 25%
The program should display the following information based on the
user input:
Split or No split (Yes or No),  Number of people entered: (number)
(each person = & in output) Check amount: (number) Service Quality:
(String) Total to pay: Total tip: Total per person: Tip per person:
Ex:
Split or No split (Yes or No)?
Yes
Enter the number of people
4
Enter the check amount:
476
How was the srvice quality?
(Excellent/Great/Good/Fair/Poor)
Excellent
output:
Number of people entered: 4
Total to pay: 595.0
Total tip: 119.0
Total per person: 148.75
Tip per person: 29.75
HINT: you will need to use .equals() method
 */