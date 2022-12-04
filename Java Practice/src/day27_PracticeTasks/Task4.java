package day27_PracticeTasks;

public class Task4 {

    public static void main(String[] args) {

        String str="JAVA java";
        int upperCases=0;
        int lowerCases=0;


        for(int i =0;i<str.length();i++){
            if(str.charAt(i)>='A'&&str.charAt(i)<='Z'){
                upperCases++;
            }
            if(str.charAt(i)>='a'&&str.charAt(i)<='z'){
                lowerCases++;
            }
        }
        boolean upperAndLowerAreEqual= upperCases==lowerCases;
        System.out.println("upperAndLowerAreEqual = " + upperAndLowerAreEqual);

    }



    }
