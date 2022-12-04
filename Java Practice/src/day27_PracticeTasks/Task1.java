package day27_PracticeTasks;

import java.util.Arrays;

public class Task1 {



    public static void main(String[] args) {

        int[] array={10, 20, 30, 40, 50};

            int[] array2=new int[array.length+1];
            int number=100;

            int index=0;

            for (int each:array) {

                array2[index] = array[index];
                if(index==2){
                    break;
                }
                index++;


            }
            for(int i=2;i<array.length;i++){
                array2[i+1]=array[i];
            }
            array2[2]=number;

        System.out.println(Arrays.toString(array2));


        }





    }

