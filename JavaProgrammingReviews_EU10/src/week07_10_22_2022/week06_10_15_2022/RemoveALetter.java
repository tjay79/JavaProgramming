package week07_10_22_2022.week06_10_15_2022;

import java.lang.module.FindException;

public class RemoveALetter {

    public static void main(String[] args) {

        String word="Adamm";
        int n=3;
        String temp="";
        if(n>word.length()||n<0){
            System.out.println("This is not valid index");
        }else {

            for (int i = 0; i < word.length(); i++) {
             if(i==n)
                 continue;
             temp+=word.charAt(i);
            }
            System.out.println(temp);
        }




    }
}
