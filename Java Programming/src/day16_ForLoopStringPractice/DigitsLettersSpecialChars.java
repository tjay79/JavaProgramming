package day16_ForLoopStringPractice;

public class DigitsLettersSpecialChars {

    public static void main(String[] args) {

        String word="Cydeo12345School!@#$%WoodenSpoon";

        String digits="";
        String letters="";
        String specialChar="";

        for(int i=0; i<=word.length()-1;i++){

            char ch= word.charAt(i);
            if(ch>='0'&&ch<='9'){
                digits+=ch;
            }else if(ch>='A'&&ch<='Z'){
                letters+=ch;
            }else if(ch>='a'&&ch<='z'){
                letters+=ch;
            }else{
                specialChar+=ch;
            }
        }
        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specialChar = " + specialChar);
    }
}
