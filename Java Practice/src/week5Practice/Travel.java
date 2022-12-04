package week5Practice;

import java.util.Scanner;

public class Travel {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);



        System.out.println("Do you have a valid passport?");
        String passport=scan.next();
        scan.nextLine();
        System.out.println("What country do you wish to travel to?");
        String country = scan.nextLine();
        System.out.println("How many bags will you be carrying?");
        byte bags = scan.nextByte();
        System.out.println("How Many people will be traveling with you?");
        short people = scan.nextShort();
        scan.nextLine();
        System.out.println("Enter the name of the people you are traveling with");
        String names = scan.nextLine();
        double basicCost =0;
        if(passport.equals("Yes")) {

            basicCost=1000;
            double costOfBags = bags * 50;
            double ticketDiscount = (people == 1) ? 100 : (people == 2) ? 200 : 300;
            double totalCost = basicCost+costOfBags-ticketDiscount;
            System.out.println("Your ticket is booked to " + country + ". We have charged extra for the " + bags + " bags but " +
                    "you are traveling with " + names + " so we are giving you a discount. Your total cost is $" + totalCost);
        }

        if(passport.equals("No")){
            System.out.println("How long has your passport been expired?");
            int expired = scan.nextInt();
            scan.nextLine();
            System.out.println("In which country do you wish to travel?");
            String nextCountry=scan.nextLine();
            System.out.println("Will you be traveling in the next year?");
            String nextYear = scan.next();

            double passportCost=200;
            int passportExpired = 2022-expired;
            double passportExtra = passportExpired*75;
            if(nextYear.equals("Yes")){
                passportCost+=100;
                double passportTotal=passportCost+passportExtra;
                System.out.println("Looks like your passport has been expired for " + passportExpired + " years, but no " +
                        "worry we will get it ready for you to travel to "+ nextCountry + ". Your total has come out to " + passportTotal);
            }else{
                passportCost-=50;
                double passportTotal=passportCost+passportExtra;
                System.out.println("Looks like your passport has been expired for " + passportExpired + " years, but no worry " +
                        "we will get it ready for your travel to " + nextCountry + ". Your total has come out to $" + passportTotal);
            }


        }



    }
}
/*
Create a class calledTravel. Make a cost variable to calculate how
much the person will owe after everything.
Ask the user if they have a valid passport (yes or no)
If the user enters yes:
The base cost of the ticket
should be set to: 1000
Ask the user the country they to travel to
(String, multiple word)
Ask the user how many bags they will take
with them (byte)
> Each bag will add 50 to the cost
Ask the user how many people they will travel
with (short)
> For each person the cost is
reduced by 100. Up to a limit of 300.
Ask the user to Enter the name of the people
they will travel with in one line, separating each name with a comma
(String, multiple word)
Print: "Your ticket is booked to
$countryName. We have charged extra for the $numberOfBags bags but you are
traveling with $peopleYouTravelWith so we are giving a discount. Your
total cost is $costAmount"
If the user enters no:
The base cost of the passport
renewal is: 200
            Ask the user when their passport
expired(int)
                > Each year it was
expired adds 75 to the cost
Ask the user which country they plan to
travel
            Ask the user if they will be
traveling in the next year (String - yes or no)
                > If yes: add 100 to
the cost
                > If no: subtract 50
from the cost
Print: "Looks like your password has
been expired for $years, but not to worry we will get it ready for you to
travel to $allCountries. Your total cost has come out to $costAmount."
 */