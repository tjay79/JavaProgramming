package day27_PracticeTasks;

public class Task3 {

    public static void main(String[] args) {

    String str="Wooden Spoon!";
    String letters="";
    String digits="";
    String specialChars="";

    for(int i=0;i<str.length();i++){

        if((str.charAt(i)>='A'&& str.charAt(i)<='Z')||(str.charAt(i)>='a'&&str.charAt(i)<='z')){
            letters+=str.charAt(i);
        }else if(str.charAt(i)>='0'&&str.charAt(i)<='9'){
            digits+=str.charAt(i);
        }else{
            specialChars+=str.charAt(i);
        }
    }
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialChars = " + specialChars);

    }



}
