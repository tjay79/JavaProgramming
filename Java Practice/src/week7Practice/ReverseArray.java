package week7Practice;

public class ReverseArray {

    public static void main(String[] args) {

        String[] names={"Anthony Arabia", "Franco Bonasera", "Uwe Heinrichs", "Ayse Karabulut", "Harun Ozgul", "Bilal Koseoglu",
                "Alessandro Stockem", "Carmela Chianta", "Roberto Sanfilippo", "Rosario Bona"};


        for (String each : names) {
            String reversed="";
            for( int i =each.length()-1;i>=0;i--){
                reversed+=""+each.charAt(i);



            }
            System.out.println(reversed);
        }


    }
}
