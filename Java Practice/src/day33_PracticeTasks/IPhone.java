package day33_PracticeTasks;

public class IPhone {

    public String model;
    public double price;
    public String color;
    public String size;
    public static String brand="Apple";
    public static String OS="IOS";
    public static String madeIn="China";

    public IPhone(String model, double price, String color, String size) {
        this.model = model;
        this.price = price;
        this.color = color;
        this.size = size;
    }

    public String faceTime(long phoneNumber){
        return "Face Timing "+phoneNumber;
    }

    public String faceTime(String email){
        return "Face Timing "+email;
    }

     public String call(long phoneNumber){
        return "Calling "+phoneNumber;
     }

     public String text(long phoneNumber){
        return "Texting "+phoneNumber;
     }

    public String toString() {
        return "IPhone{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
/*
IPhone Task:
1. Create a class named IPhone:
Attributes:
instance: model, price,
color, size
statics: brand, OS, madeIn
Add a constructor that can set All the
fields (instances)
Actions:
faceTime(long phoneNumber)
faceTime(String email)
call(long phoneNumber)
text(long phoneNumber)
toString()
 */
