package week11_11_19_2022;

import java.util.ArrayList;
import java.util.Arrays;

public class Task2_MergeArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> num1= new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> num2=new ArrayList<>(Arrays.asList(4, 5, 6));

        int[] merge=mergeIntoArray(num1, num2);

        System.out.println(Arrays.toString(merge));



    }

    public static int[] mergeIntoArray(ArrayList<Integer> num1, ArrayList<Integer> num2){

        int[] result=new int[num1.size()+num2.size()];

        int index=0;
        for (Integer integer : num1) {
            result[index++]=integer;
        }
        for (Integer integer1 : num2) {
            result[index++]=integer1;
        }
        return result;
    }





}
