package day04_Variables;

public class Circle {

    public static void main(String[] args) {

        double pi = 3.14;
        double radius = 9.9;
        double diameter = 2 * radius;
        double area = radius * radius * pi;
        double perimeter = diameter * pi;


        System.out.println("radius = " + radius);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);
        System.out.println("diameter = " + diameter);



    }




}
/*
3. Create a class named Circle, write a program that can calculate
the area & perimeter of any given Circle
PI, radius, diameter, area, perimeter
Hints: PI = 3.14
area =
radius * radius * PI
Perimeter =
2 * radius * PI
 */