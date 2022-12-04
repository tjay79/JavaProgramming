package day08_IfStatement;

public class NumberOfDaysInAMonth {

    public static void main(String[] args) {

       int month = 2;

       boolean days31 = month ==1 || month ==3 || month ==5 || month ==7 || month ==8 || month ==10 || month ==12;
       //boolean days 31 = !days30 && !days28;
       boolean days30 = month ==4 || month ==6 || month ==9 || month ==11;
       boolean days28 = month ==2;

       if(days31){
           System.out.println(month + " has 31 days");
       }

       if(days30){
           System.out.println(month + " has 30 days");
       }

       if(days28){
           System.out.println(month + " has 28 days");
       }





    }
}
