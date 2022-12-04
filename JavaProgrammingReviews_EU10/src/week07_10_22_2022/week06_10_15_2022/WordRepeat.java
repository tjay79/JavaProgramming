package week07_10_22_2022.week06_10_15_2022;

import java.util.Scanner;

public class WordRepeat {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter a word");
        String word= scan.nextLine();
        System.out.println("What word are you looking for?");
        String lookingFor=scan.next();
        int counter=0;

        for (int i=0; i<=word.length()-lookingFor.length();i++){
          String search= word.substring(i,i+lookingFor.length());
          if  (search.equalsIgnoreCase(lookingFor)){
              counter++;
          }
        }
        System.out.println(counter);




    }
}
