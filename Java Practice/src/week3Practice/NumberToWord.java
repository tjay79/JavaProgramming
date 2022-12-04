package week3Practice;

public class NumberToWord {

    public static void main(String[] args) {

        int number = 3;

        boolean one = number==1;
        boolean two = number==2;
        boolean three = number==3;
        boolean four = number==4;
        boolean five = number==5;
        boolean six = number==6;
        boolean seven = number==7;
        boolean eight = number==8;
        boolean nine = number==9;


        if(one){
            System.out.println("one");
        }else if(two){
            System.out.println("two");
        } else if (three) {
            System.out.println("three");
        } else if (four) {
            System.out.println("four");
        } else if (five) {
            System.out.println("five");
        } else if (six) {
            System.out.println("six");
        } else if (seven) {
            System.out.println("seven");
        } else if (eight) {
            System.out.println("eight");
        }else{
            System.out.println("nine");
        }


    }
}
/*
Create a class called NumberToWord, and write a java program that can
convert numbers between 0 ~ 9 to words
Ex:
number = 1;
output:
One
 */