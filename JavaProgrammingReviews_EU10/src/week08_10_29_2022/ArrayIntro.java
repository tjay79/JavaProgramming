package week08_10_29_2022;

import java.util.Arrays;

public class ArrayIntro {

    public static void main(String[] args) {

        // if we know the elements of the Array

        int[] arrayName={1, 2, 3, 4, 5, 6};

        //if we don´t know the elements of the Array, we have to (define) know the size of the Array, in the example
       // that means that the Array can store 2 elements
        int[] arrayName1= new int[2];

        //and if we want to put elements inside the Array we proceed as follows
        arrayName1[0]=1;

        //0 represents the index number of the element in the Array
        //if we want to print out the whole Array we need to use toString method
        System.out.println(Arrays.toString(arrayName1));
        //to print out just an element of the array:
        System.out.println(arrayName1[0]);

        //all undefined elements of the Array will show:
        //String: null - int, byte, short, long: 0 - boolean: false - double and float: 0.0

        //sort method
        int[] numbers={2, 3, 1, 10, 5};




    }
}
