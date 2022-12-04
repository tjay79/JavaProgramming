package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ReverseSentence {

    public static void main(String[] args) {

        String str="Today is a good day to learn Java";
        String[] sentence=str.split(" ");
        String reverse="";

        for(int i=sentence.length-1;i>=0;i--){

            reverse+=sentence[i]+" ";


        }

        System.out.println(reverse);






    }

}
/*

 */
