package day20_Arrays;

import java.util.Arrays;


public class Months {

    public static void main(String[] args) {

        String[] months={"January", "February","March","April","May","June","July","August","September","October","November","December"};

       int number=1;

        if(number<1||number>12){
            System.out.println("Invalid number");
            System.exit(0);
        }

        for (int i = 0; i <12 ; i++) {
            System.out.println(months[i]);

        }
        for (int j = months.length-1; j >=0 ; j--) {
            System.out.println(months[j]);
        }





    }
}
