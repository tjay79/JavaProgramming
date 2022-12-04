package day28_ArrayList;

public class StrongPassword {

    public static void main(String[] args) {

        String password="Cydeo1990@";

        boolean r1=password.length()>=8&&!password.contains(" ");
        boolean r2= false;//has upper case
        boolean r3=false;//has lower case
        boolean r4=false;//has special character
        boolean r5=false;//has digit character

        char[] chars=password.toCharArray();

        for (char each : chars) {
            if (Character.isUpperCase(each)) {
                r2=true;
            }else if (Character.isLowerCase(each)) {
                r3=true;
            }else if(Character.isDigit(each)){
                r5=true;
            }else{
                r4=true;
            }
            if(r2 && r3 && r4 && r5){//as soon as the if statements are all true the loop will be exited
                break;
            }
        }
        boolean isStrongPassword=r1 && r2 && r3 && r4 && r5;

        System.out.println("isStrongPassword = " + isStrongPassword);


    }


}
