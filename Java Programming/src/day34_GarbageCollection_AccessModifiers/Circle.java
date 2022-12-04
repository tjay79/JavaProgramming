package day34_GarbageCollection_AccessModifiers;



public class Circle {

    public double radius;
    public static double pi;
    public static String name;

    public Circle(double radius){
        this.radius=radius;
       // pi=3.14;we should never use the constructor to initialize the static variable
    }
    static{
        pi=3.14;
        name="Circle";
    }
}
