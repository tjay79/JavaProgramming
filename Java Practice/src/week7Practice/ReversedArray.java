package week7Practice;

import java.util.Arrays;

public class ReversedArray {

    public static void main(String[] args) {

        int[] numbers={1, 2, 3, 4, 5};
        int[] reversed=new int[numbers.length];


        for (int i = 0, j=numbers.length-1; i < numbers.length; i++,j--) {
            reversed[j]=numbers[i];
        }
        System.out.println(Arrays.toString(reversed));

    }
}
/*
Write a program that can reverse an array of integers and
returns it as new array
ex:
array = {1,2,3,4,5};
output:
reversedArray = {5,4,3,2,1};
 */