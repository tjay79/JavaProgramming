package week4Practice;

public class CappuccinoBuyer {

    public static void main(String[] args) {

        String size = "venti";
        String priceCalorie = "";
        boolean size2 = size == "Grande" || size == "Tall" || size == "Venti";

        if (size2) {

            switch (size) {

                case "Tall":
                    priceCalorie = "tall:\nprice is $3.69\n90 calories";
                    break;

                case "Grande":
                    priceCalorie = "grande:\nprice is $3.99\n120 calories";
                    break;

                default:
                    priceCalorie = "venti:\nprice is $4.29\n150 calories";

            }

            System.out.println(priceCalorie);


        } else {
            System.out.println("Invalid size");
        }
    }
}
/*
Create a class called  CappuccinoBuyer. A variable named Size is
given, write a program that can display the price and calories of
cappuccino
Valid sizes are tall, grande, venti and their
price & calories are:
tall:
price is $3.69
90 calories
grande:
price is $3.99;
120 calories
venti:
price is $4.29
150 calories
If the size is invalid then the output should
be "Invalid Size"
Note:
 Solution 1: use if statement
Solution 2: use switch statement
Solution 2: use if & switch statements
mixed
 */