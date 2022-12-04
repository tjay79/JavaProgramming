package day08_IfStatement;

public class GradeScore {

    public static void main(String[] args) {

        int score = 65;

        boolean a = score<= 100 && score >= 90;


       // boolean b = score >=80 && score !a;
        boolean b = score >=80 && score <=89;

        boolean c = score <=79 && score >=70;
        //boolean c = score !a && score !b && score >=70;

        boolean d = score <=69 && score >=60;

        boolean f = score <=59;

        if(a){
            System.out.println("Excellent");
        }

        if(b){
            System.out.println("Great");
        }

        if(c){
            System.out.println("Good");
        }

        if(d){
            System.out.println("Passed");
        }

        if(f){
            System.out.println("Failed");
        }

    }
}
