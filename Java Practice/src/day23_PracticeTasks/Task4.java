package day23_PracticeTasks;

public class Task4 {

    public static void main(String[] args) {

        eligibleToVote(18,"usa");

    }

    public static void eligibleToVote(int age, String citizen){

        boolean eligibleToVote=age>=18&&citizen.equalsIgnoreCase("usa");
        if(eligibleToVote){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("You are not eligible to vote");
        }
    }
}
/*
create a method that can check if a person is eligible to vote
Ex:
eligibleToVote(19, "USA");
output:
You are not eligible to vote!
 */

