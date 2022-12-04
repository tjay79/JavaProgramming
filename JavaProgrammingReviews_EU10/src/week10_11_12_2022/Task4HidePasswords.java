package week10_11_12_2022;

import java.util.Arrays;

public class Task4HidePasswords {
     /*
    Task 4 : Hide Passwords
			        Given an array of passwords (String). Hide each password as a star (*) and show the hidden password
					Ex:
					Input:
					{"one", "hi", "hold}
					Output:
					[ ***, **, **** ]
     */

    public static void main(String[] args) {

        String [] arr={"one", "hi", "hold"};

        String [] result=  hidePassword(arr);

        System.out.println(Arrays.toString(result));

    }

    public static String[] hidePassword(String[] arr) {

        String [] resultsOfHiddenPasswords=new String[arr.length];
        int index=0;
        //I need to get each element
        for (String element : arr) {
            //one
            //convert letter to stars
            String result=   convertLetterToStar(element);
            resultsOfHiddenPasswords[index++]=result;
        }


        return resultsOfHiddenPasswords;
    }

    // this method will get the string it will convert into the stars
    public static String convertLetterToStar(String eachWord) {
        //one
        String temp="";
        for (int i = 0; i < eachWord.length(); i++) {
            //  eachWord.charAt(i);
            temp+="*";
        }
        return temp;

    }
}


