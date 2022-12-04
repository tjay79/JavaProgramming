package week11_11_19_2022;

import java.util.ArrayList;
import java.util.Arrays;

public class Task3_GetUniqueElements {

    public static void main(String[] args) {

        int[] first={1, 2, 3, 4, 5};
        int[] second={4, 5, 6, 6, 7};

        ArrayList<Integer> result=getUniqueElements(first, second);

        System.out.println(result);

    }

    public static ArrayList<Integer> getUniqueElements(int[] first, int[] second){

        ArrayList<Integer> result= new ArrayList<>();
       // ArrayList<Integer> result=new ArrayList<>(Arrays.asList(first))

        for (int i : first) {
            result.add(i);
        }
        for (int j : second) {
            if(!result.contains(j)){
                result.add(j);
            }
        }

        return result;
    }
}
/*
Create a method that get two arrays as a parameters then return the arraylist which has contains unique elements in it.

first array :1,2,3,4,5

second array :4,5,6

output:

1,2,3,4,5,6
 */
