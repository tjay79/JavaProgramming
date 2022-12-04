package week7Practice;

public class Classmates {

    public static void main(String[] args) {

        String[] names={"Anthony Arabia", "Franco Bonasera", "Uwe Heinrichs", "Ayse Karabulut", "Harun Ozgul", "Bilal Koseoglu",
        "Alessandro Stockem", "Carmela Chianta", "Roberto Sanfilippo", "Rosario Bona"};

        String initials1="";
        String initials2="";
        for (String each:names) {
            initials1= ""+each.charAt(0);
            initials2=""+each.charAt(each.indexOf(" ")+1);
            System.out.println(initials1+"."+initials2+".");
        }






    }
}
/*
reate an array named classmates, and store 10 of your classmates'
full names
print the initials of each classmates in separate lines
 */