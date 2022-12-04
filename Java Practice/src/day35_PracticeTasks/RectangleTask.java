package day35_PracticeTasks;

public class RectangleTask {

    private double width;
    private double length;

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        if(width<=0){
            System.out.println("Invalid value: "+width);
        }
        this.width=width;
    }

    public void setLength(double length) {
        if(length<=0){
            System.out.println("Invalid value: "+length);
        }
        this.length=length;
    }

    public RectangleTask(double width, double length) {
        setWidth(width);
        setLength(length);
    }

    public double calcArea(){
        double area=width*length;
        return area;
    }
    public double calcPerimeter(){
        double perimeter= (width+length)*2;
        return perimeter;
    }

    public String toString() {
        return "RectangleTask{" +
                "width=" + width +
                ", length=" + length +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }
}
/*
Rectangle Task:
2.1 Create a class named Rectangle:
Private variables:
width, length
Encapsulate all the fields
Conditions:
width of
the rectangle should not be negative
length of
the rectangle should not be negative
Add a constructor that allows user to
set all the fields when the object is created.
(If the arguments
not valid it should not be set to the instances)
Methods:
calcArea(): returns the area
of rectangle
calcPerimeter(): returns the
perimeter of rectangle
toString(): can display the
width, length, area, and perimeter of rectangle when object is passed in
print statement
 */
