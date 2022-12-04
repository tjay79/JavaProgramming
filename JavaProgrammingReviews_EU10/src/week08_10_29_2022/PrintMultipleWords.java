package week08_10_29_2022;

public class PrintMultipleWords {

    public static void main(String[] args) {

        String str="knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer";
        String[] words=str.split(", ");

        for(String each:words){
            if(each.contains(" ")){
                System.out.println(each);
            }
        }

    }
}
/*
Write a program that accepts string and prints multiple words in the string

        "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer”

        output : wooden spoons
                 trash can
                  dish washer
 */
