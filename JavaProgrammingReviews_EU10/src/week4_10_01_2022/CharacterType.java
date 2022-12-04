package week4_10_01_2022;

public class CharacterType {

    public static void main(String[] args) {

        char character = 'A';
        boolean isUpperCase = character>='A'&& character<='Z';
        boolean isLowerCase = character>='a'&& character<='z';
        boolean notAlphabetic = !(isUpperCase || isLowerCase);
        String result ="";

        if(isUpperCase){
            result= character + " is an upper case letter";
        }
        if(isLowerCase){
            result = character + " is a lower case letter";
        }if(notAlphabetic){
            result = character + " is not an alphabetic character";
        }

        System.out.println(result);


    }
}
