package week5Practice;

import java.util.Scanner;

public class RetrieveCharacters {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.next();

        String alphabetic="";
        String numeric ="";
        String special ="";



        for (int i = 0; i <=word.length()-1 ; i++) {
           char letter= word.charAt(i);

            if(letter>='A'&&letter<='Z'||letter>='a'&&letter<='z'){
              alphabetic=""+letter;


            }else if(letter>='0'&&letter<='9'){
                numeric=""+letter;

            }else{
               special=""+letter;

            }
            System.out.println("letters: "+alphabetic + "\ndigits: " + numeric + "\nspecial chars: "+special);
        }






    }
}
