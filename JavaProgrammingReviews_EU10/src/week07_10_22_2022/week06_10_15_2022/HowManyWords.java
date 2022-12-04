package week07_10_22_2022.week06_10_15_2022;

public class HowManyWords {

    public static void main(String[] args) {

        String sentence="Java is java in everwhere is java";
        int counter=1;

        for (int i=0;i<=sentence.length()-1;i++){

            String space= ""+sentence.charAt(i);
            if(space.equals(" ")) {
                counter++;
            }


        }
        System.out.println(counter);






    }
}
