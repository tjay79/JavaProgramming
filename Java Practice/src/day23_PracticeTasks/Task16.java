package day23_PracticeTasks;

public class Task16 {

    public static void main(String[] args) {

        fullName("anThONy","ARAbiA");
    }

    public static void fullName(String first, String last){

        first=first.toLowerCase();
        last=last.toLowerCase();
        String firstLetterFirst=first.substring(0,1).toUpperCase();
        String firstLetterLast=last.substring(0,1).toUpperCase();
        first=first.replaceFirst(first.substring(0,1),firstLetterFirst);
        last=last.replaceFirst(last.substring(0,1),firstLetterLast);
        System.out.println(first+" "+last);




    }


}
/*
write a method that can print out the full name of a person in
regular format
ex:
fullName("cYdEo", "SCHOOL");
output:
"Cydeo School"
 */
