package day23_PracticeTasks;

public class Task12 {

    public static void main(String[] args) {

        positveNegativeOrZero(0);


    }

    public static void positveNegativeOrZero(int num){

        if(num>0){
            System.out.println(num+" is positive");
        }else if(num<0){
            System.out.println(num+" is negative");
        }else{
            System.out.println(num+" is zero");
        }

    }
}
/*
create a method that can if the given integer is positive,
negative or zero
 */
