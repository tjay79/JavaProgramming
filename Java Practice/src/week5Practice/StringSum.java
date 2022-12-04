package week5Practice;

import java.util.Scanner;

public class StringSum {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word");
        String word =scan.next();
        int length= word.length()-1;
        int total=0;

        for (int i = 0; i <=length ; i++) {

            char letter=word.charAt(i);
            if(letter>='0'&&letter<='9'){
                total+=letter-48;
            }else{

            }


        }
        System.out.println(total);



    }
}
/*
Write a program that can return the sum of digits from a  string
Ex:
input: A1B2C3
output:    6
Hint: You need to get each of the character by using a loop
             To convert char to number:

   '0' - 48   ==> 0

   '1' - 48   ==> 1
                ...
 */