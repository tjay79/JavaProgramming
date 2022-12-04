package week7Practice;

import java.util.Arrays;

public class ArrayInDescendingOrder {

    public static void main(String[] args) {

        int[] numbers={2, 6, 90, 56, 87};
        int[] reverse=new int[numbers.length];

        Arrays.sort(numbers);

       for(int i= numbers.length-1,j=0;i>=0;i--,j++){
           reverse[j]=numbers[i];
       }
        System.out.println(Arrays.toString(reverse));

    }
}
/*
Write a program that sort the array of integer in descending
order
 */
