package day27_PracticeTasks;

import java.util.Arrays;

public class Task2 {

    public static void main(String[] args) {


        int[] array={10, 20, 30, 40, 50};

        int[] swapped=new int[array.length];

        int index1=2;
        int index2=4;

        for(int i=0;i<array.length;i++){

            swapped[i]=array[i];
            if(i==index1){
                swapped[i]=array[index2];
            }
            if(i==index2){
                swapped[i]=array[index1];
            }

        }

        System.out.println(Arrays.toString(swapped));

    }
}
