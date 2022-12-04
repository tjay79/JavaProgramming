package week3Practice;

public class LearnOs {

    public static void main(String[] args) {

        String brand = "Iphone";
        boolean mac = brand =="Mac";
        boolean lenovo = brand =="Lenovo";
        boolean iphone = brand =="Iphone";
        boolean samsung = brand =="Samsung";


        if(mac){
            System.out.println("MacOS");
        }else if(lenovo){
            System.out.println("Windows");
        }else if(iphone){
            System.out.println("IOS");
        }else if(samsung){
            System.out.println("Android");
        }else{
            System.out.println("Invalid brand");
        }





    }
}
