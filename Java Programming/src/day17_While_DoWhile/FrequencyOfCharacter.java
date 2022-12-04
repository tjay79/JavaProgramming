package day17_While_DoWhile;

public class FrequencyOfCharacter {

    public static void main(String[] args) {

        String str = "AABBBBCAAAAAAAAAAAAAAA";
        char ch='B';

        int frequency=0;

        for (int i = 0; i <str.length() ; i++) {

            char eachChar=str.charAt(i);
            if(eachChar==ch){
                frequency+=1;
            }

        }
        System.out.println(frequency);

    }
}
