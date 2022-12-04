package day33_PracticeTasks;

public class Person {

    public String name;
    public int age;
    public char gender;
    public static boolean isHuman=true;
    public static boolean hasNose=true;
    public static boolean hasWings=false;
    public static int numberOfHead=1;
    public static int numberOfEyes=2;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String eat(String food){
        return name+" is eating "+food;
    }

    public String drink(String drink){
        return name+" is drinking "+drink;
    }

    public void sleep(){
        System.out.println(name+ " is sleeping");
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
