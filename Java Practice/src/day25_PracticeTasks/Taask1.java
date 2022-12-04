package day25_PracticeTasks;

import java.util.Arrays;

public class Taask1 {

    public static void main(String[] args) {

        int[] arr1={1, 2, 3};
        int[] arr2={4, 5, 6};
        int[] arr3=merge(arr1,arr2);
        System.out.println(Arrays.toString(arr3));
        
    }
    
    public static int[] merge(int[]a,int[]b){
        int[] c=new int[a.length+b.length];

        int index=0;
        for (int each : a) {
            c[index]=each;
            index++;
        }
        for (int each2 : b) {
            c[index]=each2;
            index++;
        }
        return c;
    }
    public static double[] merge(double[]a,double[]b){
        double[] c=new double[a.length+b.length];

        int index=0;
        for (double each : a) {
            c[index]=each;
            index++;
        }
        for (double each2 : b) {
            c[index]=each2;
            index++;
        }
        return c;
    }
    public static char[] merge(char[]a,char[]b){
        char[] c=new char[a.length+b.length];

        int index=0;
        for (char each : a) {
            c[index]=each;
            index++;
        }
        for (char each2 : b) {
            c[index]=each2;
            index++;
        }
        return c;
    }
    public static String[] merge(String[]a,String[]b){
        String[] c=new String[a.length+b.length];

        int index=0;
        for (String each : a) {
            c[index]=each;
            index++;
        }
        for (String each2 : b) {
            c[index]=each2;
            index++;
        }
        return c;
    }
}
/*
Task1:
1. create a method that can merge two integer arrays.
2. create a method that can merge two double arrays.
3. create a method that can merge two char arrays.
4. create a method that can merge two String arrays.
 */
