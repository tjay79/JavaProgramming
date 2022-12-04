package day17_While_DoWhile;

public class FrequencyOfWord {

    public static void main(String[] args) {

        String word="JavaJavaJava";
        int frequency=0;

        for (int i = 0; i <word.length()-3 ; i++) {

            String subs=word.substring(i,i+4);
            if(subs.equals("Java")){
                frequency++;
            }

        }
        System.out.println(frequency);


    }
}
