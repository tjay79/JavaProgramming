package day36_PracticeTasks.PhoneTask;

public class Iphone extends Phone{


    public Iphone(String model, String size, double price, String color) {
        super("Apple", model, size, price, color);
    }

    public void faceTime(long phoneNumber){
        System.out.println(model+" is facetiming "+phoneNumber);
    }

    public void faceTime(String email){
        System.out.println(model+" is facetiming "+ email);
    }








}
