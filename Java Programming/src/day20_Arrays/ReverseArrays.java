package day20_Arrays;

import java.util.Arrays;

public class ReverseArrays {

    public static void main(String[] args) {

        int[] array={1, 2, 3, 4, 5};
        int[] reversed=new int[array.length];
        int index=0;

        for (int i=array.length-1;i>=0;i--){

           reversed[index]= array[i];
           index++;


        }
        System.out.println(Arrays.toString(reversed));




    }
}
