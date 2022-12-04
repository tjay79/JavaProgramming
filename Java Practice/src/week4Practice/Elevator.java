package week4Practice;

public class Elevator {

    public static void main(String[] args) {

        int floorNumber = 6;
        String companies = "";

        if(floorNumber >=1 && floorNumber<=3){

            switch (floorNumber){

                case 1:
                    companies = "Floor 1 selected.\nCompanies: Lobby, Verizon, Starbucks";
                    break;

                case 2:
                    companies = "Floor 2 selected.\nCompanies: Cybertek, NASA, Intelsat";
                    break;

                default:
                    companies = "Floor 3 selected.\nCompanies: Lyft, BofA, Steak house";




            }
            System.out.println(companies);



        }else{
            System.out.println("Invalid floor");
        }







    }
}
/*
2. Create a class called Elevator. A variable named floorNumber is
given, write a program that can display the floor info
when floorNum is 1 -> print "Floor 1
selected. Companies: Lobby, Verizon, Starbucks"
when floorNum is 2 -> print "Floor 2
selected. Companies: Cybertek, NASA, Intelsat"
when floorNum is 3 -> print "Floor 3
selected. Companies: Lyft, BofA, Stake house"
 anything else: print "Invalid floor - 6"
 Note:
 Solution 1: use nested if statement
Solution 2: use switch statement
Solution 2: use if & switch statements
mixed
 */