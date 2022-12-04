package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPractice3 {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("How many numbers would you like to enter");
        int totalNum=scan.nextInt();

        if(totalNum<=0){
            System.out.println("Number not valid");
            System.exit(0);
        }
        int[] numbers= new int[totalNum];

        for(int i =0;i<totalNum;i++){
            System.out.println("Enter a number");
            int num=scan.nextInt();
            numbers[i]=num;

        }
        System.out.println(Arrays.toString(numbers));

        scan.close();






    }
}
