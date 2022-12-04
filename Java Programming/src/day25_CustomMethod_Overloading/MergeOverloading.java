package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class MergeOverloading {

    public static void main(String[] args) {
        int[] array1={1, 2, 3, 4};
        int[] array2={5, 6, 7};

        int[] arr3=merge2integerArrays(array1,array2);
        System.out.println(Arrays.toString(arr3));

    }

    public static int[] merge2integerArrays(int[] arr, int[]arr2){
        int[] result=new int[arr.length+ arr2.length];
        int i=0;
        for (int each : arr) {
            result[i++]=each;
        }
        for (int each2 : arr2) {
            result[i++]=each2;
        }
        return result;
    }
}
