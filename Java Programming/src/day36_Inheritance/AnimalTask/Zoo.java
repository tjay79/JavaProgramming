package day36_Inheritance.AnimalTask;

public class Zoo {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Max", "Husky", 'M', 'S', 2, "Grey");
        dog.eat();
        dog.drink();
        dog.sleep();
        dog.move();
        dog.bark();

        Cat cat = new Cat();
        cat.setInfo("Tarcin", "British",'M','L',3,"brown");
        cat.eat();
        cat.sleep();
        cat.drink();
        cat.move();
        cat.scratch();

        Tiger tiger= new Tiger();
        tiger.setInfo("Sher Khan", "Bengal",'M','M',4, "Orange");
        tiger.eat();
        tiger.drink();
        tiger.sleep();
        tiger.move();
        tiger.roar();
        tiger.hunt();











    }
}
