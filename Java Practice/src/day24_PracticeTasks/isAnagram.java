package day24_PracticeTasks;

import java.util.Arrays;

public class isAnagram {

    public static void main(String[] args) {

        boolean isAnagram=isAnagram("heart","earth");
        System.out.println(isAnagram);




    }
    public static boolean isAnagram(String str1, String str2){
        boolean isAnagram= true;
        char[] letters1=str1.toCharArray();
        char[] letters2=str2.toCharArray();
        Arrays.sort(letters1);
        Arrays.sort(letters2);
        isAnagram=Arrays.equals(letters1,letters2);

        return isAnagram;
    }


}
/*
2. create a method named isAnagram that passes two String parameters,
the method returns true if the given two strings are anagram, otherwise
returns false
Ex:
str1 = "cba"
str2 = "bac";
isAnagram(str1, str2) ====> true
 */
