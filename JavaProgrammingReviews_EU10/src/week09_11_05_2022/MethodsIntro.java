package week09_11_05_2022;

public class MethodsIntro {

    public static void main(String[] args) {
        //print hello 5 times

        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        //print hello 5 times
        printHello5Times();


    }

    public static void printHello5Times() {
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
    }

    int result = sum(5, 6);

    public int sum(int i, int j) {
        return i + j;
    }
    public static void MultiplyWith2AndPrint(int result){
        System.out.println(result*2);


    }

}

