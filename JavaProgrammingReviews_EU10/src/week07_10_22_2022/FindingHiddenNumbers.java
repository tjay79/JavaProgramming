package week07_10_22_2022;

import java.util.Random;
import java.util.Scanner;

public class FindingHiddenNumbers {

    public static void main(String[] args) {
        Random random= new Random();
        int hiddenNumbers= random.nextInt(10) + 1;
        Scanner scan=new Scanner(System.in);
       boolean flag=true;
      do{
          System.out.println("Enter a number");
          int number=scan.nextInt();

          if(number==hiddenNumbers){
              System.out.println("You found the number, Congrats");
              flag=false;
          }else{
              System.out.println("Try again");
          }
      }while(flag);










    }
}
