package day20_Arrays;

import java.util.Scanner;

public class MinMax {

    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        int[] numbers=new int[10];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number");
            numbers[i]=scan.nextInt();//User´s input will be assigned to the indexes of the array numbers
        }
        int max= numbers[0];
        int min= numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0)
                max = numbers[i];

            if (numbers[i] < min) {
                min= numbers[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
