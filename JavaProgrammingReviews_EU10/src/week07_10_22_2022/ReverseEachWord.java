package week07_10_22_2022;

public class ReverseEachWord {

    public static void main(String[] args) {

        String str = "Adam come here. When are you coming? ";
        String newMsg = "";

        while(str.contains(" ")) {

            int firstIndexOfFirstSpace = str.indexOf(" ");
            for (int i = firstIndexOfFirstSpace - 1; i >= 0; i--) {
                newMsg += str.charAt(i);
            }
            newMsg += " ";
            str = str.substring(firstIndexOfFirstSpace + 1);
        }
        if (str.length()>0){

            for (int i = str.length() - 1; i >= 0; i--) {
                newMsg += str.charAt(i);
            }
        }
        System.out.println(newMsg);






    }
}