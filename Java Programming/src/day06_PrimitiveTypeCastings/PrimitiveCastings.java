package day06_PrimitiveTypeCastings;

public class PrimitiveCastings {

    public static void main(String[] args) {

        byte a = 100;
        short b = a;

        //      (short)a

        int c = b; // implicit casting (assigning a smaller primitive type to a larger primitive type)


        int x = 55;
        short y = (short) x;

        System.out.println(x + " : " + y);

        System.out.println("_____________________________");


        long j = 1000000;
        short k = (short) j;

        System.out.println(j + " : " + k);

        System.out.println("_____________________________");


        double l = 2.5;
        float m = (float)l;

        System.out.println(l + " : " + m);

        System.out.println("______________________________");



        double n = 10.8;
        int s =  (int)n;

        System.out.println(n + " : " + s);

        System.out.println("_________________________________");


        double d1 = 20.5;
        short s1 = (short) d1;

        System.out.println(d1 + " : " + s1);

        System.out.println("___________________________________");



        float f1 = 30.5f;
        long l1 = (long) f1;

        System.out.println(f1 + " : " + l1);

        System.out.println("___________________________________");







    }
}
