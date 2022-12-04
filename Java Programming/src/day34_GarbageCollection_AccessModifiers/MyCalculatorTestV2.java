package day34_GarbageCollection_AccessModifiers;

public class MyCalculatorTestV2 {

    public static void main(String[] args) {

        MyCalculatorV2 a= new MyCalculatorV2();

        int b=a.add(3,3);
        System.out.println(b);

        int c=a.minus(4, 3);
        System.out.println(c);

        int d=a.multiply(3, 3);
        System.out.println(d);

        int e= a.divide(8, 4);
        System.out.println(e);




    }
}
