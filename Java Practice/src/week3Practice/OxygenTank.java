package week3Practice;

public class OxygenTank {

    public static void main(String[] args) {

        int level = 90;

        boolean above90 = level>90 && level<=100;
        boolean above80 = level <=90 && level >80;
        boolean above70 = level <=80 && level >70;
        boolean above60 = level <=70 && level >60;
        boolean above50 = level <=60 && level >50;

        String output = "";

        if(above90){
            output = "Your tank is full";
        }else if(above80){
            output = "Still okay";
        }else if(above70){
            output= "Don´t go to far";
        }else if(above60){
            output = "Start to head back";
        }else if(above50){
            output = "Be careful now you´re at 50%";
        }else{
            output = "Your tank is empty";
        }
        System.out.println(output);










    }
}
