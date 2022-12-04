package day09_IfStatements;

public class NameOfTheDay {

    public static void main(String[] args) {


        int n = 4;
        String day;




        if(n ==1){
            day = "Monday";
            //System.out.println("Today is monday");
        }else if(n ==2){
            day = "Tuesday";
            //System.out.println("Today is tuesday");
        }else if(n ==3){
            day = "Wednesday";
            //System.out.println("Today is wednesday");
        }else if(n ==4){
            day = "Thursday";
            //System.out.println("Today is thursday");
        }else if(n ==5){
            day = "Friday";
            //System.out.println("Today is friday");
        }else if(n ==6){
            day = "Saturday";
            //System.out.println("Today is saturday");
        }else{
            day = "Sunday";
            //System.out.println("Today is sunday");
        }
        System.out.println("day = " + day);





    }
}
