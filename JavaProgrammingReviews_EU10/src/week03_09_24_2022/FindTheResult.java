package week03_09_24_2022;

public class FindTheResult {

    public static void main(String[] args) {

        int a = 15;

        boolean div3 = a%3==0;
        boolean div5 = a%5==0;
        boolean div15 = a%15==0;

        if (div3) {
            int plus20 = a+20;
            System.out.println("plus20 = " + plus20);
        }
        if(div5){
            int plus25 = a+25;
            System.out.println("plus25 = " + plus25);
        }
        if(div15){
            int plus50 = a+50;
            System.out.println("plus50 = " + plus50);
        }







    }
}
/*
Create a class which is "FindTheResult" create a variable
    int a=15;
         if a is divisable by 3 add 20
         if a is divisable by 5 add 25
         if a is divisable by 15 add 50
 */