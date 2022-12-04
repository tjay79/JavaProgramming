package week7Practice;

import java.util.Arrays;

public class CommonNumbers {

    public static void main(String[] args) {

        int[] arr1={1,2,3,4,5};
        int[] arr2={4,5,6,7,8};

        int[] common=new int[2];
        int index=0;

        for (int i : arr1) {

            for (int j : arr2) {
             if(i==j){
                 common[index]=i;
                 index++;
             }
            }
        }
        System.out.println(Arrays.toString(common));






    }
}
/*
Write a program that can print out the common elements from two
integer array
Ex:
arr1: {1,2,3,4,5}
arr2: {4,5,6,7,8}
output:
4 5
MUST use for each loops
 */
