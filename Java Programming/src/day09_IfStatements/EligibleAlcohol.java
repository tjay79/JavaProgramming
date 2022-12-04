package day09_IfStatements;

public class EligibleAlcohol {

    public static void main(String[] args) {

        String name = "Anna";
        int age = 20;

        boolean eligible = age >=21;

        if(eligible){
            System.out.println(name + " can buy alcohol");
        }else{
            System.out.println(name + " cannot buy alcohol");
        }


    }
}
