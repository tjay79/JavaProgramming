package day35_Encapsulation.encapsulation;

public class Circle {

    private double radius;
    public static double pi;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius<=0){
            System.err.println("Invalid radius: "+ radius);
            return;
        }
        this.radius = radius;
    }

    public Circle(double radius) {
        setRadius(radius);
    }

    static{
        pi=3.14;
    }

    public double calcArea(){

        double area= 2*radius*radius;
        return area;
    }
    public double calcPerimeter(){
        double perimeter=2*pi*radius;
        return perimeter;
    }



    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "area=" + calcArea() +
                "perimeter=" + calcPerimeter() +
                '}';
    }
}
