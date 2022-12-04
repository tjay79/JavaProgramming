package day08_IfStatement;

public class SingleIfStatementIntro {

    public static void main(String[] args) {

        int number = 153;



        boolean evenNumber = number % 2 ==0;
        boolean oddNumber = !evenNumber;

        if (evenNumber){

        System.out.println(number + " is an even number");}

        if (oddNumber) {

            System.out.println(number + " is an odd number");
        }

        System.out.println("-----------------------------------");

        int number2 = 0;

        boolean positiveNumber = number2 > 0;
        boolean negativeNumber = number2 <0;
        boolean zero = number2 ==0;

        if(positiveNumber){

            System.out.println(number2 + " is a positive number");
        }

        if(negativeNumber){
            System.out.println(number2 + " is a negative number");
        }

        if(zero){
            System.out.println(number2 + " is equal to zero");
        }

        System.out.println("-------------------------------------------------");

        String name = "Josh";
        int age = 28;
        String citizen = "USA";

        boolean isEligible = age >=18 && citizen == "USA";

        if(isEligible){
            System.out.println(name + " is eligible to vote");
        }

        if(!isEligible){
            System.out.println(name + " is not eligible to vote");
        }






    }
}
