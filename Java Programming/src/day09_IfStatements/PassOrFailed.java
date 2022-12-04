package day09_IfStatements;

public class PassOrFailed {

    public static void main(String[] args) {

        int score = 58;

        boolean passed = score >=60;
        boolean failed = !passed;

        if(passed){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }





    }
}
