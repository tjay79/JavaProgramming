package utilities;

import java.util.Arrays;

public class StringUtilities {

    public static void main(String[] args) {

    }

    //prints each character of the given String
    public static void printEachChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }

    }

    //reverses any given String and returns a reverse String
    public static String reverse(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {

            result += str.charAt(i);

        }
        return result;
    }

    //checks if the given String is Palindrome
    public static boolean isPalidrome(String str) {

        boolean isPalidrome = reverse(str).equalsIgnoreCase(str);

        return isPalidrome;
    }

    //checks if the given String is an Anagram
    public static boolean isAnagram(String str1, String str2) {

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1, ch2);

    }

    //removes the duplicated character from a String, returns a String
    public static String removeDuplicates(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char each = str.charAt(i);

            if (!result.contains("" + each)) {
                result += each;
            }
        }
        return result;

    }

    //tells if the password is strong (8 characters,no space, upper case, lower case, digit and special character)

    public static boolean StrongPassword(String password) {
        boolean r1 = password.length() >= 8 && !password.contains(" ");
        boolean r2 = false;//has upper case
        boolean r3 = false;//has lower case
        boolean r4 = false;//has special character
        boolean r5 = false;//has digit character

        char[] chars = password.toCharArray();

        for (char each : chars) {
            if (Character.isUpperCase(each)) {
                r2 = true;
            } else if (Character.isLowerCase(each)) {
                r3 = true;
            } else if (Character.isDigit(each)) {
                r5 = true;
            } else {
                r4 = true;
            }
        }
        boolean isStrongPassword = r1 && r2 && r3 && r4 && r5;

        System.out.println("isStrongPassword = " + isStrongPassword);

        return isStrongPassword;
    }



}
