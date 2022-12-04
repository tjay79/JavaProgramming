package day25_CustomMethod_Overloading;

import utilities.ArraysUtilities;

import java.util.Arrays;

public class Test2 {

    public static void main(String[] args) {

        int[] arr={1, 2, 3, 4, 5};
        ArraysUtilities.printEachElement(arr);

        System.out.println("--------------------------------");

        double[] arr2={1.5, 2.4, 4.5, 4.9};
        ArraysUtilities.printEachElement(arr2);

        System.out.println("-----------------------------------");

        int[] n1={1, 20, 3, 4, 5, 6};
        int max=ArraysUtilities.maxNumber(n1);
        System.out.println(max);

        System.out.println("---------------------------------------");

        int[] i1={1, 2, 3, 4, 5};
        boolean isThere=ArraysUtilities.isContained(i1, 8);
        System.out.println(isThere);

        int[] arr1={1, 2, 2, 3, 4, 4, 5, 6, 6, 8};

        int[] unique=ArraysUtilities.uniqueElements(arr1);

       System.out.println(Arrays.toString(unique));

        int[] numbers={100, 200, 300, 400, 500, 600};
       numbers= ArraysUtilities.removeElement(numbers,1);
        System.out.println(Arrays.toString(numbers));

        String[] array={"Anna","Damian","John"};
        String[] array2={"douglas","Sarah", "Dominik"};

        String[] array3=ArraysUtilities.merged(array, array2);
        System.out.println(Arrays.toString(array3));


        System.out.println("_________________________________");

        int[] ar1={10, 20, 30, 40, 50};

        int[] swap=ArraysUtilities.swap(ar1, 2, 4);

        System.out.println(Arrays.toString(swap));
    }


}
