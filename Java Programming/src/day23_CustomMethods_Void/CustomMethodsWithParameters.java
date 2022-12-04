package day23_CustomMethods_Void;

public class CustomMethodsWithParameters {

    public static void main(String[] args) {

        // oddOrEven(); the method demands additional info to complete the task
        oddOrEven(8);
        age(1979);
        printNumbers(20,45);
    }
    //create a function that can check if a number is odd or even

    public static void oddOrEven(int number){
        if(number%2==0){
            System.out.println(number+" is an even number");
        }else{
            System.out.println(number+" is an odd number");
        }
    }

    public static void age(int birthYear){

        int age =2022-birthYear;
        System.out.println("your age is: "+age);

    }

    public static void printNumbers(int x, int y){

        for (int i = x; i <=y ; i++) {
            System.out.print(i+" ");
        }

    }
}
