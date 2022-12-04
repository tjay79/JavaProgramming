package week3Practice;

public class CharacterIdentity {

    public static void main(String[] args) {

        char character = '8';

        boolean alphabetic = (character >='A' && character <='Z') || (character >='a' && character <= 'z');
        boolean digit = character >= '0' && character <= '9';

        if(alphabetic){
            System.out.println("Alphabetic Character");
        }else if(digit){
            System.out.println("Digit Character");
        }else{
            System.out.println("Special Character");
        }





    }
}
/*
Create a class called Character Identity, and write a program that can
identify if the given character is a digit or Alphabetic Character(A~Z
or a~Z) or a special character
Ex:
ch = '@'
output:
Special Character
HINT: You may wanna check out the numbers of the
chracters on ASCII table
 */