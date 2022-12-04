package day11_SwitchStatements;

public class Grade2 {

    public static void main(String[] args) {

        char grade = 'F';
        String  result;

        switch (grade){

            case 'A':
            case 'B':
            case 'C':
            case 'D':
                result = "Passed";
                break;

            case 'F':
                result = "Failed";
                break;

            default:
                result = "Invalid";

        }

        System.out.println(result);


    }
}
