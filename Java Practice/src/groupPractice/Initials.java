package groupPractice;

public class Initials {

    public static void main(String[] args) {

        String str= "Robert Down Junior";

        String firstName=str.substring(0,str.indexOf(" "));
        String secondName=str.substring(str.indexOf(" ")+1,str.lastIndexOf(" "));
        String lastName=str.substring(str.lastIndexOf(" "));

        System.out.println(firstName.charAt(0)+". "+secondName.charAt(0)+". "+lastName);





    }
}
