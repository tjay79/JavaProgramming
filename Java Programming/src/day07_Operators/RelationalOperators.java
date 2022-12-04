package day07_Operators;

public class RelationalOperators {

    public static void main (String[] args){

        // >, >=, <, <=

        boolean result1 = 20 > 40;

        System.out.println("result1 = " + result1);

        boolean result2 = 300 >= 150;

        System.out.println("result2 = " + result2);

        boolean result3 = 100 >= 100;

        System.out.println("result3 = " + result3);

        boolean result4 = 300 >= 500;

        System.out.println("result4 = " + result4);

        // credit score 720

        int creditScore = 745;
        boolean isEligible = creditScore >= 720; //if the credit score is 730 or greater, then it´s
        // eligible for the loan

        System.out.println("isEligible = " + isEligible);

        System.out.println("------------------------------------------------------");

        int x = 100;
        int y = 200;

        boolean equal = x == y;

        System.out.println("equal = " + equal);



    }
}
