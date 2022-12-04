package day12_Scanner;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the radius of the circle");

        double radius = scan.nextDouble();

        double area = radius*2;
        double perimeter = radius*2*3.14;


        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);


    }
}
