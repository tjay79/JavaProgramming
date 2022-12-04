package week7Practice;

import java.util.Arrays;

public class AllZerosAtTheEnd {

    public static void main(String[] args) {

        int[] numbers= {10, 0, 5, 0, 1, 0};
        int[] temp=new int[numbers.length];
        int example=0;

        Arrays.sort(numbers);

        for (int i = numbers.length - 1, j=0; i >= 0; i--,j++) {
            temp[j]=numbers[i];
        }

        System.out.println(Arrays.toString(temp));




    }
}
/*
write a program that can move all the zeros to the end of the array
Ex:
array = {10, 0, 5, 0, 1, 0};
output:
{10, 5, 1, 0, 0, 0}
 */