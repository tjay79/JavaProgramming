package week4_10_01_2022;

public class CodilityTask {

    public static void main(String[] args) {

        int num = 30;
        String result ="";

        if(num>=0){

            if(num%2==0){
                result= "Codility";

            }
            if(num%3==0){
                result+="Test";
            }

            if(num%5==0){
                result+="Coders";
            }else{
                System.out.println("Number is not divisible by 2, 3 or 5");
            }


        }else{
            System.err.println("Invalid number");
        }

        System.out.println(result);


    }
}
