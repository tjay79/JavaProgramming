package day10_NestedIf;

public class TernariesIntro {

    public static void main(String[] args) {

        int n = 99;
        String oddOrEven = "";


       oddOrEven = (n%2==0)? "Even" : "Odd";

        System.out.println(oddOrEven);


        System.out.println("------------------------------------------------");

        int age = 19;
        String result = "";

        result= (age >=21)? "Is eligible" : "Is not eligible";
        System.out.println(result);


        System.out.println("-----------------------------------------------------");

        int number = -23;
        String result2 = "";

        result2 = (number >0)? "Positive" :(number<0)? "Negative" : "Zero";
        System.out.println(result2);


    }
}
