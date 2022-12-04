package day07_Operators;

public class UnaryOperators {

    public static void main(String[] args) {

        int a = 5;
        ++a; //pre increment: increases the value by 1 right away

        System.out.println(a);

        --a; //pre decrement: decreases the value by 1 immediately

        System.out.println(a);

        int b = 100;
        System.out.println(++b);

        int c = 100;
        System.out.println(c++); //post increment: it will pass the current value before increasing the value by 1
        System.out.println(c); //101

        int x = 200;
        System.out.println(--x); //pre decrement: decreases by 1 right away

        int y = 200;
        System.out.println(y--);






    }
}
