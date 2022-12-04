package day24_CustomMethods_Return;

public class ReturnStatement {

    public static void main(String[] args) {
        nameOfTheDay(6);



    }
    public static void nameOfTheDay(int number){

        if(number<1||number>7){
            System.out.println("Invalid number");
            return;
        }
        if(number==1){
            System.out.println("Mon");
        }else if(number==2){
            System.out.println("Tue");
        }else if(number==3){
            System.out.println("Wed");
        }else if(number==4){
            System.out.println("Thu");
        }else if(number==5){
            System.out.println("Fri");
        }else if(number==6){
            System.out.println("Sat");
        }else{
            System.out.println("Sun");
        }

    }
}//return statement exists the current Method
