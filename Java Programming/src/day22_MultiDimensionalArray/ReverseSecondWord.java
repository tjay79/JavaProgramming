package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ReverseSecondWord {

    public static void main(String[] args) {

        String sentence="I Love Java";
        String[] words=sentence.split(" ");
        String  reverse="";
        for(String each:words){

            if(each.equals("Love")){
                for(int i=each.length()-1;i>=0;i--){

                    reverse+=each.charAt(i);
                    words[1]=reverse;

                }
            }



        }
        sentence=sentence.replaceFirst("Love",reverse);
        System.out.println(sentence);



    }
}
