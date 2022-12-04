package day01_HelloWorld;

public class WhichSchool {

    public static void main(String[] args) {

        int age= 2;

        if(age>=0&&age<=2){
            System.out.println("The child should stay at home");
        }else if(age>=3&&age<=6){
            System.out.println("The child should be in kindergarten");
        }else if(age>=7&&age<=12){
            System.out.println("The child should be in primary school");
        }else{
            System.out.println("Invalid age");
        }




    }
}
