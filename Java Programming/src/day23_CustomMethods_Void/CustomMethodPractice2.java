package day23_CustomMethods_Void;

public class CustomMethodPractice2 {

    public static void main(String[] args) {
        helloCydeo5Times();
        helloWorld5Times();
        allEven1To10();
    }
    public static void helloWorld5Times(){

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");

        }
    }
    public static void helloCydeo5Times(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello Cydeo");
        }
    }
    public static void allEven1To10(){
        for (int i = 0; i <=10 ; i++) {
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
    }
}
