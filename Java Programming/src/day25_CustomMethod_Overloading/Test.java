package day25_CustomMethod_Overloading;

import utilities.ArraysUtilities;
import utilities.StringUtilities;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        String str="Java Programming Language";
        StringUtilities.printEachChar(str);

        System.out.println("---------------------------");

        String str2="Java";
       str2= StringUtilities.reverse(str2);
        System.out.println(str2);

        System.out.println("---------------------------------");

        String str3="Civic";

        boolean palindrome=StringUtilities.isPalidrome(str3);
        System.out.println(palindrome);

        System.out.println("------------------------------");

        String[] names={"Anna", "Java", "Python", "racecar", "Mom", "Cydeo"};

        int count=0;

        for (String each : names) {
            if(StringUtilities.isPalidrome(each)){
                count++;
            }
        }
        System.out.println(count);

        System.out.println("-------------------------------------");

        String s2="aaaaaabbbbbbcccccddd";

        String nonDup=StringUtilities.removeDuplicates(s2);
        System.out.println(nonDup);

        int[] array={1, 2, 3, 4, 5, 6};

        System.out.println("__________________________________________");


        int[] ar1={10, 20, 30, 40, 50, };
        int[] array2=ArraysUtilities.insert(ar1, 2, 100);

        System.out.println(Arrays.toString(array2));








    }
}
