package week05_10_08_2022;

import java.util.Scanner;

public class FirstAndLast {

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);

        System.out.println("Enter a word");
        String word=scan.next();

        if(word.length()<=2){
            System.out.println(word);
        }else{
            System.out.println(word.substring(1,word.length()-1));
        }





    }
}
