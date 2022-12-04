package day15_ForLoop;

public class ForLoopPractice {

    public static void main(String[] args) {

        for (int i = 15; i <= 45; i += 1) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("------------------------------------------");

        for (int i = 100; i >= 50; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("-------------------------------------------");

        for (int i = 2; i < 55; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("------------------------------------------------------------");

        for (char i = 65; i <= 90; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("-----------------------------------------------------------");

        for (char i = 90; i >= 65; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("----------------------------------------------------------");

        for (char i = 97; i <= 122; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("----------------------------------------------------------");

        for (char i = 122; i >= 97; i--) {
            System.out.print(i + " ");


        }
    }
}