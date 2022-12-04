package day23_PracticeTasks;

public class Task3 {

    public static void main(String[] args) {

        EligibleToBuyAlcohol(20);

    }

    public static void EligibleToBuyAlcohol(int age){

        boolean isEligible=age>21;
        System.out.println(isEligible);
    }
}
/*
create a method that can check if a person is eligible to buy
alcohol
 */
