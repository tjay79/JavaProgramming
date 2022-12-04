package week7Practice;

public class ReverseNames {

    public static void main(String[] args) {

        String[] names={"Anthony Arabia", "Franco Bonasera", "Uwe Heinrichs", "Ayse Karabulut", "Harun Ozgul", "Bilal Koseoglu",
                "Alessandro Stockem", "Carmela Chianta", "Roberto Sanfilippo", "Rosario Bona"};

        String reverse="";

        for (int i = 0; i < names.length; i++) {



            for (int j = names[i].length() - 1; j >= 0; j--) {

                System.out.print(""+names[i].charAt(j));

            }

            System.out.println();
        }

    }
}
