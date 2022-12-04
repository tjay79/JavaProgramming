package day25_CustomMethod_Overloading;

public class WarmupTask1 {

    public static void main(String[] args) {

      int sum=  sumOf2Numbers(10,20);
        System.out.println(sum);
        int sum2=sumOf3Numbers(10, 20, 30);
        System.out.println(sum2);
        int sum4= sumOf4Numbers(10, 20, 30 ,40);
        System.out.println(sum4);



    }
    public static int sumOf2Numbers(int n1,int n2){
        int result=n1+n2;
        return result;
    }
    public static int sumOf3Numbers(int n3, int n4, int n5){
        int result=n3+n4+n5;
        return result;
    }
    public static int sumOf4Numbers(int n6, int n7, int n8, int n9){
        int result=n6+n7+n8+n9;
        return result;
    }



}
