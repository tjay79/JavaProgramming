package day09_IfStatements;

public class EligibleToVote {

    public static void main(String[] args) {

        String name = "Anna";
        int age = 20;
        String citizen = "USA";

        boolean eligible = age >= 18 && citizen == "USA";

        if(eligible){
            System.out.println(name + " can vote");
        }else{
            System.out.println(name + " cannot vote");
        }





    }
}
