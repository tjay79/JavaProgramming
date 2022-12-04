package week4_10_01_2022;

import java.util.Scanner;

public class EligibleToDonate {

    public static void main(String[] args) {

        Scanner eligible = new Scanner(System.in);


        System.out.println("Please enter your age:");
        int age = eligible.nextInt();

        String message ;


        if(age>=18 && age<=65){

            System.out.println("Please enter your weight:");
            double weight = eligible.nextDouble();

            if(weight>=50){
                message="You can donate blood";
            }else{
                message="You are not eligible to donate blood";
            }


        }else{
            message="You must be 18 or younger than 65 to donate blood";
        }

        System.out.println(message);

        eligible.close();


    }
}
