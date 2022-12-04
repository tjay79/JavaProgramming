package week05_10_08_2022;

public class PasswordEncryption {

    public static void main(String[] args) {

        String password="cydeo";
        char encryptWith='X';
        String result="";

        for (int i = 0; i <=password.length()-1; i++) {

            result=result+password.charAt(i)+""+encryptWith;
        }
        System.out.println("result = " + result);
    }
}
