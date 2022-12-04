package day15_ForLoop;

public class FormatFullName {

    public static void main(String[] args) {

        String first= "cyDEo";
        String lastName= "SCHOOL";

        String character = first.substring(0,1).toUpperCase() + first.substring(1).toLowerCase();
        String character2 = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();

        System.out.println(character + " "+ character2);



    }
}
